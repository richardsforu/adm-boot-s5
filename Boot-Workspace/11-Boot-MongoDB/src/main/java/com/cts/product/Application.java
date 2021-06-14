package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.document.Product;
import com.cts.product.document.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	  ApplicationContext ac=	SpringApplication.run(Application.class, args);
	  
	  ProductRepository prodDao = ac.getBean(ProductRepository.class);
	  
	  Product p1=new Product();
	  p1.setId("P002");
	  p1.setName("test");
	  p1.setPrice(5555);
	  p1.setDescription("desc");
	  
	  prodDao.save(p1);
	  
	  
	}

}
