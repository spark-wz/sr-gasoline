package com.unicorn.srgasoline.service;


import com.unicorn.srgasoline.entity.Flowmeter;

import java.util.List;

public interface FlowmeterManageServcie {

    //流量计管理列表
    List<Flowmeter> getFlowmeterList();

    //流量计删除
    int deleteFlowmeter(String ylbbh);

    //流量计更新
    int updateFlowmeter(Flowmeter flowmeter);
}
