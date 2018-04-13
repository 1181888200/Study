package com.lwl.boot.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("关闭了.........");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("启动了.........");
	}

}
