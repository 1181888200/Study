package com.lwl.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootLog4jApplication {
	

	private static final Logger logger = LoggerFactory.getLogger(SpringBootLog4jApplication.class);

	
	public static void main(String[] args) {
		logger.info("SpringBootLog4jApplication 开启启动了.......");
		
		SpringApplication.run(SpringBootLog4jApplication.class, args);
	}
}
