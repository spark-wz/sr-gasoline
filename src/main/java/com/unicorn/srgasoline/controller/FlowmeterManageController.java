package com.unicorn.srgasoline.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unicorn.srgasoline.common.ServiceResult;
import com.unicorn.srgasoline.dto.DeleteParam;
import com.unicorn.srgasoline.dto.QueryParam;
import com.unicorn.srgasoline.entity.Flowmeter;
import com.unicorn.srgasoline.service.FlowmeterManageServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/srGasoline/FlowmeterManage")
public class FlowmeterManageController {

    @Autowired
    private FlowmeterManageServcie flowmeterManageServcie;

    @RequestMapping(value = "/getFlowmeterManage")
    @ResponseBody
    public ServiceResult getFlowmeterManage(@RequestBody QueryParam param){
        PageHelper.startPage(param.getPage(),param.getPageSize());
        List<Flowmeter> flowmeterList = flowmeterManageServcie.getFlowmeterList();
        PageInfo<Flowmeter> pageList = new PageInfo<>(flowmeterList);
        return new ServiceResult(pageList);
    }

    @RequestMapping(value = "/deleteFlowmeterManage")
    @ResponseBody
    public ServiceResult deleteFlowmeterManage(@RequestBody DeleteParam param){
        int i = flowmeterManageServcie.deleteFlowmeter(param.getYlbbh());
        return new ServiceResult(i);
    }

    @RequestMapping(value = "//")
    @ResponseBody
    public ServiceResult updateFlowmeterManage(@RequestBody Flowmeter flowmeter){
        return new ServiceResult(flowmeterManageServcie.updateFlowmeter(flowmeter));
    }
}
