package com.unicorn.srgasoline.service;

import com.unicorn.srgasoline.dto.BaseQueryParam;
import com.unicorn.srgasoline.dto.SfyVo;
import com.unicorn.srgasoline.entity.TieluSfy;

import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 22:34
 */
public interface TieluSfyService {
	/**
	 *查询数据
	 */
	List<TieluSfy> getTieluSfyList(BaseQueryParam param);
	/**
	 *同步数据
	 */
	void syncTieluSfyList();

	/**
	 *查询数据汇总
	 */
	List<SfyVo> getTieluSfyVoList(BaseQueryParam param);
}
