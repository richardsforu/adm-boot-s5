package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cts.product.entity.Product;
import com.cts.product.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);

		ProductRepository prodDao = ac.getBean(ProductRepository.class);

		/*Product prod = prodDao.findByName("Pen");
		if (prod != null)
			System.out.println(prod);
		else
			System.out.println("Product Not Found");
			*/

		// prodDao.findAll().forEach(System.out::println);

		// Product prod = prodDao.findById(4).orElse(null);
		// prod.setDescription("Samsung A9 8 GB Ram");
		// prodDao.save(prod);
		// System.out.println(prod);
		
		
		
		//prodDao.findByNameLike("%Note%").forEach(System.out::println);
		
		//prodDao.findByPriceBetween(15000, 80000).forEach(System.out::println);
		
		//prodDao.findByPriceGreaterThanEqual(1000).forEach(System.out::println);
		
	
	//prodDao.findByNameLikeAndPriceGreaterThanEqual("%a%", 15000).forEach(System.out::println);
		
		//prodDao.allProducts().forEach(System.out::println);
		//prodDao.filter1(5000).forEach(System.out::println);
		
	//	prodDao.filter2().forEach(System.out::println);
		
		prodDao.updateProduct("New Name", 4444, "New Desc", 2);
		
		
		
		
		
		
		
		
		
		
		

	}

}
