package com.unicorn.srgasoline.dao;

import com.unicorn.srgasoline.entity.Flowmeter;
import com.unicorn.srgasoline.entity.FlowmeterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FlowmeterMapper {
    int countByExample(FlowmeterExample example);

    int deleteByExample(FlowmeterExample example);

    int insert(Flowmeter record);

    int insertSelective(Flowmeter record);

    List<Flowmeter> selectByExample(FlowmeterExample example);

    int updateByExampleSelective(@Param("record") Flowmeter record, @Param("example") FlowmeterExample example);

    int updateByExample(@Param("record") Flowmeter record, @Param("example") FlowmeterExample example);
}