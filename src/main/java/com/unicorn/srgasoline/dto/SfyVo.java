package com.unicorn.srgasoline.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/9 0:23
 */
@Data
public class SfyVo implements Serializable {

	private Integer sfyNumber;

	private BigDecimal receiveOilCount;

	private BigDecimal sendOilCount;
}
