package com.unicorn.srgasoline.service.impl;


import com.unicorn.srgasoline.common.DataSourceContextHolder;
import com.unicorn.srgasoline.dao.FlowmeterMapper;
import com.unicorn.srgasoline.entity.Flowmeter;
import com.unicorn.srgasoline.entity.FlowmeterExample;
import com.unicorn.srgasoline.service.FlowmeterManageServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowmeterManageServcieImpl implements FlowmeterManageServcie {

    @Autowired
    private FlowmeterMapper flowmeterMapper;

    @Override
    public List<Flowmeter> getFlowmeterList() {
        DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
        FlowmeterExample flowmeterExample = new FlowmeterExample();
        List<Flowmeter> flowmeters = flowmeterMapper.selectByExample(flowmeterExample);
        return flowmeters;
    }

    @Override
    public int deleteFlowmeter(String ylbbh) {
        DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
        FlowmeterExample flowmeterExample = new FlowmeterExample();
        flowmeterExample.or().andYlbbhEqualTo(ylbbh);
        return flowmeterMapper.deleteByExample(flowmeterExample);
    }

    @Override
    public int updateFlowmeter(Flowmeter flowmeter) {
        DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
        FlowmeterExample flowmeterExample = new FlowmeterExample();
        flowmeterExample.or().andYlbbhEqualTo(flowmeter.getYlbbh());
        return flowmeterMapper.updateByExampleSelective(flowmeter,flowmeterExample);
    }

}
