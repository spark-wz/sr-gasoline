package com.unicorn.srgasoline.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unicorn.srgasoline.common.ServiceResult;
import com.unicorn.srgasoline.dto.BaseQueryParam;
import com.unicorn.srgasoline.dto.SfyViewVo;
import com.unicorn.srgasoline.dto.SfyVo;
import com.unicorn.srgasoline.entity.TieluSfy;
import com.unicorn.srgasoline.service.TieluSfyService;
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
@RequestMapping(value="/srGasoline/TieluSfy")
public class TieluSfyController {

	@Autowired
	private TieluSfyService tieluSfyService;

	@RequestMapping(value="/getTieluSfyView")
	@ResponseBody
	public ServiceResult getTieluSfyView(@RequestBody BaseQueryParam param){
		//分页
		PageHelper.startPage(param.getPage(), param.getPageSize());
		List<TieluSfy> list = tieluSfyService.getTieluSfyList(param);
		PageInfo<TieluSfy> pageList = new PageInfo<>(list);
		SfyViewVo vo = new SfyViewVo();
		vo.setTieluList(pageList);

		List<SfyVo> listVo = tieluSfyService.getTieluSfyVoList(param);
		vo.setSfyList(listVo);
		return new ServiceResult(vo);
	}

}
