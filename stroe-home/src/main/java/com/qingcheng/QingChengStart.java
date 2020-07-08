package com.qingcheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import tk.mybatis.spring.annotation.MapperScan;

@EnableAutoConfiguration
@SpringBootApplication
@MapperScan(basePackages = "com.qingcheng.mapper")
@ServletComponentScan
@EnableScheduling
public class QingChengStart {
	public static void main(String[] args) {
		SpringApplication.run(QingChengStart.class);
	}
}
