package com.lwl.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.lwl.boot.interceptor.MyInterceptor;
import com.lwl.boot.interceptor.MyInterceptor2;

@SpringBootApplication
public class SpringBootInterceptorApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInterceptorApplication.class, args);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor2()).addPathPatterns("/index","/*");
		registry.addInterceptor(myInterceptor()).addPathPatterns("/*");
	}
	
	@Bean
	public MyInterceptor myInterceptor() {
		return new MyInterceptor();
	}
	
	@Bean
	public MyInterceptor2 myInterceptor2() {
		return new MyInterceptor2();
	}
	
}
