package com.unicorn.srgasoline.dao;

import com.unicorn.srgasoline.dto.BaseQueryParam;
import com.unicorn.srgasoline.dto.SfyQueryParam;
import com.unicorn.srgasoline.dto.SfyVo;
import com.unicorn.srgasoline.entity.TieluSfy;
import com.unicorn.srgasoline.entity.TieluSfyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TieluSfyMapper {
    int countByExample(TieluSfyExample example);

    int deleteByExample(TieluSfyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TieluSfy record);

    int insertSelective(TieluSfy record);

    List<TieluSfy> selectByExample(TieluSfyExample example);

    TieluSfy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TieluSfy record, @Param("example") TieluSfyExample example);

    int updateByExample(@Param("record") TieluSfy record, @Param("example") TieluSfyExample example);

    int updateByPrimaryKeySelective(TieluSfy record);

    int updateByPrimaryKey(TieluSfy record);

    List<TieluSfy> selectByTableName(@Param("param") SfyQueryParam param);

    List<SfyVo> selectTieluSfyVoList(@Param("param") BaseQueryParam param);
}