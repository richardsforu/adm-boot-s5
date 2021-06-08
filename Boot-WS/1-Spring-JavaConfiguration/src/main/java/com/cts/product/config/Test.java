package com.cts.product.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.service.ProducttServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac= new AnnotationConfigApplicationContext(AppConfig.class);
		//ApplicationContext ac= new ClassPathXmlApplicationContext("spring.xml");

		
		ProducttServiceImpl ps = ac.getBean(ProducttServiceImpl.class);
		
		ps.f1();
		
		
	}

}
