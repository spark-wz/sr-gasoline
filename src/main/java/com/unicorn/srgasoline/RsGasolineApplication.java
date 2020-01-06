package com.unicorn.srgasoline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})//多数据原配置
@MapperScan("com.unicorn.srgasoline.dao") //指定要扫描的Mapper类的包的路径
public class RsGasolineApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsGasolineApplication.class, args);
	}

}
