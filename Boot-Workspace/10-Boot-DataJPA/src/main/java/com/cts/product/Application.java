package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		ProductRepository prodDao = ac.getBean(ProductRepository.class);
		
		//prodDao.findAll().forEach(System.out::println);
		
		Product prod = prodDao.findById(4).orElse(null);
		prod.setDescription("Samsung A9 8 GB Ram");
		prodDao.save(prod);
		System.out.println(prod);
		
	}

}
