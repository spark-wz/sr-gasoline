package com.unicorn.srgasoline.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unicorn.srgasoline.common.ServiceResult;
import com.unicorn.srgasoline.dto.BaseQueryParam;
import com.unicorn.srgasoline.entity.Records;
import com.unicorn.srgasoline.service.RecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 15:02
 */
@RestController
@RequestMapping(value="/srGasoline/Records")
public class RecordsController {

	@Autowired
	private RecordsService recordsService;

	@RequestMapping(value="/getRecordsList")
	@ResponseBody
	public ServiceResult getRecordsList(@RequestBody BaseQueryParam param){
		//分页
		PageHelper.startPage(param.getPage(), param.getPageSize());
		List<Records> list = recordsService.getRecordsList(param);
		PageInfo<Records> pageList = new PageInfo<>(list);
		return new ServiceResult(pageList);
	}
}
