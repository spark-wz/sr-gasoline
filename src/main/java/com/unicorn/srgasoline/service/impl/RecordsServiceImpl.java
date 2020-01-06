package com.unicorn.srgasoline.service.impl;

import com.github.pagehelper.PageHelper;
import com.unicorn.srgasoline.common.DataSourceContextHolder;
import com.unicorn.srgasoline.dao.RecordsMapper;
import com.unicorn.srgasoline.dto.BaseQueryParam;
import com.unicorn.srgasoline.entity.Records;
import com.unicorn.srgasoline.entity.RecordsExample;
import com.unicorn.srgasoline.service.RecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 14:57
 */
@Service
public class RecordsServiceImpl implements RecordsService {
	@Autowired
	private RecordsMapper recordsMapper;

	@Override
	public List<Records> getRecordsList(BaseQueryParam param) {
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);

		RecordsExample recordsExample = new RecordsExample();
		recordsExample.setOrderByClause("Date1 DESC, Time1 DESC");
		RecordsExample.Criteria criteria = recordsExample.createCriteria();
		if(!StringUtils.isEmpty(param.getStartTime())){
			criteria.andDate1GreaterThanOrEqualTo(param.getStartTime());
		}
		if(!StringUtils.isEmpty(param.getEndTime())){
			criteria.andDate1LessThanOrEqualTo(param.getEndTime());
		}
		if(param.getNumber() != null){
			criteria.andHeweiEqualTo(param.getNumber().shortValue());
		}
		return recordsMapper.selectByExample(recordsExample);
	}

	@Override
	public void syncRecords() {
		//获取最后一次ID
		Long updateId = getLastId();
		//获取同步数据
		List<Records> updateList = getUpdateList(updateId);
		if(!updateList.isEmpty()){
			//切换分库
			DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
			//保存
			for(Records t: updateList){
				recordsMapper.insert(t);
			}
		}
	}

	private Long getLastId(){
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
		Long updateId = 0L;
		PageHelper.startPage(1, 1);
		RecordsExample recordsExample = new RecordsExample();
		recordsExample.setOrderByClause("ID DESC");
		List<Records> list = recordsMapper.selectByExample(recordsExample);
		if(!list.isEmpty()){
			updateId = list.get(0).getId();
		}
		return updateId;
	}

	private List<Records> getUpdateList(Long updateId){
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.SQLSERVER_1);
		RecordsExample recordsExample = new RecordsExample();
		recordsExample.createCriteria().andIdGreaterThan(updateId);
		return recordsMapper.selectByExample(recordsExample);
	}
}
