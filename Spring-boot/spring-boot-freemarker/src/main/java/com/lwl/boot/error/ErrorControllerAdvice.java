package com.lwl.boot.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;


@ControllerAdvice
public class ErrorControllerAdvice {
	
	@ExceptionHandler(Exception.class)
	public void handlerError(Exception ex,HandlerMethod method) {
		System.out.println("统一异常处理");
		//获取异常信息
		System.out.println(ex.getMessage());
		//获取异常发生的类
		System.out.println(method.getBean().getClass());
		//获取异常发生类中的方法
		System.out.println(method.getMethod().getName());
	}
}
