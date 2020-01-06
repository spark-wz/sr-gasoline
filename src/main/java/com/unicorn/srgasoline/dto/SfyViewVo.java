package com.unicorn.srgasoline.dto;

import com.github.pagehelper.PageInfo;
import com.unicorn.srgasoline.entity.TieluSfy;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/9 0:23
 */
@Data
public class SfyViewVo implements Serializable {

	private PageInfo<TieluSfy> tieluList;

	private List<SfyVo> sfyList;
}
