package com.lwl.boot.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private DataSource dataSource;
	
	
	@RequestMapping("/index")
	public String index() {
		
		System.out.println(dataSource);
		
		return "hello word";
	}
	
}
