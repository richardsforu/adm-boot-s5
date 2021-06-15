package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.repository.MySQLProductRepository;
import com.cts.product.repository.ProductRepository;
import com.cts.product.service.DataBaseServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		
		DataBaseServiceImpl ds = ac.getBean(DataBaseServiceImpl.class);

		ProductRepository pr = ac.getBean(ProductRepository.class);
		MySQLProductRepository mySqlDao = ac.getBean(MySQLProductRepository.class);

		pr.findAll().forEach(System.out::println);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		mySqlDao.findAll().forEach(System.out::println);

		
		
		

	}

}
