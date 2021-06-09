package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.cts.product.service.AccountServiceImpl;
import com.cts.product.service.ProductService;
import com.cts.product.service.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		
		ProductService ps1 = ac.getBean(AccountServiceImpl.class); 
		ProductService ps2 = ac.getBean(ProductServiceImpl.class);

		ps1.findAll();
		ps1.findById();
		
		ps2.findAll();
		ps2.findById();
		
		
		
		
		
		

	}

}
