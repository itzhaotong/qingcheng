package com.qingcheng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration
@SpringBootApplication
@MapperScan(basePackages="com.qingcheng.mapper")
@ServletComponentScan
@EnableScheduling
public class QingChengStart {
	public static void main(String[] args) {
		SpringApplication.run(QingChengStart.class);
	}
}
