package com.lwl.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lwl.boot.mybatis.mapper")
public class SpringBootDataSourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataSourceApplication.class, args);
	}
}
