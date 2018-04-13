package com.lwl.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@RequestMapping("/hello")
	public String hello() {
		
		try {
			int i = 1 /0;
			System.out.println(i);
		} catch (Exception e) {
			logger.error("HelloController:发生异常错误信息.....", e);
		}
		
		return "hello log4j";
	}
	
}
