package com.cts.product;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.repository.ProductRepositoryImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		ProductRepositoryImpl prodDao = ac.getBean(ProductRepositoryImpl.class);
		
		List<Product> products = prodDao.findAll();
		
		//products.forEach(product->{
		//	System.out.println(product);
		//});
		
		//prodDao.findAll().forEach(System.out::println);
		
		Product prod = prodDao.findById(4);
		if(prod!=null) {
			System.out.println(prod);
		}else{
			System.out.println("id not found");
		}
		
		
		
	}
	
	

}
