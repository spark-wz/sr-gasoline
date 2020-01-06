package com.unicorn.srgasoline.service;

import com.unicorn.srgasoline.dto.BaseQueryParam;
import com.unicorn.srgasoline.entity.Records;

import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 14:48
 */
public interface RecordsService {
	/**
	 *列表查询
	 */
	List<Records> getRecordsList(BaseQueryParam param);

	/**
	 *数据同步
	 */
	void syncRecords();

}
