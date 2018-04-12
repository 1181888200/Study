package com.lwl.boot;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.lwl.boot.mybatis.mapper")
//@EnableTransactionManagement
@ImportResource("classpath:applicationContent-tx.xml")
public class SpringBootDataSourceApplication {

	//通过xml方式需要提供该方法
	@Bean
	public PlatformTransactionManager txManager(DataSource dataSource) {
		DataSourceTransactionManager txManager = new DataSourceTransactionManager(dataSource);
		return txManager;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataSourceApplication.class, args);
	}
}
