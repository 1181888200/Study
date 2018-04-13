package com.lwl.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.lwl.boot.filter.MyFilter;
import com.lwl.boot.listener.MyListener;
import com.lwl.boot.servlet.MyServlet;

@SpringBootApplication
@ServletComponentScan
public class SpringBootServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServletApplication.class, args);
	}
	
	/**********
	 * 通过springboot的方式
	 * 	1.将@SpringBootApplication除外的注解全部移除
	 *  2.创建bean
	 * *********/
	
//	@Bean
//	public ServletRegistrationBean myServlet() {
//		ServletRegistrationBean myServlet = new ServletRegistrationBean();
//		//添加自定义servlet类
//		myServlet.setServlet(new MyServlet());
//		//添加需要进入servlet的请求
//		myServlet.addUrlMappings("/myServlet");
//		return myServlet;
//	}
//	
//	@Bean
//	public FilterRegistrationBean myFilter() {
//		FilterRegistrationBean myFilter = new FilterRegistrationBean();
//		//添加自定义filter类
//		myFilter.setFilter(new MyFilter());
//		//添加需要进入filter的请求
//		myFilter.addUrlPatterns("/*");
//		return myFilter;
//	}
//	
//	@Bean
//	public ServletListenerRegistrationBean myListener() {
//		ServletListenerRegistrationBean myListener = new ServletListenerRegistrationBean();
//		//添加自定义listener类
//		myListener.setListener(new MyListener());
//		return myListener;
//	}
	
}
