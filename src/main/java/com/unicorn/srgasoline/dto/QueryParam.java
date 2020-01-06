package com.unicorn.srgasoline.dto;

import lombok.Data;

@Data
public class QueryParam {

    private String startTime;

    private String endTime;

    protected int page = 1;

    protected int pageSize = 20;
}
