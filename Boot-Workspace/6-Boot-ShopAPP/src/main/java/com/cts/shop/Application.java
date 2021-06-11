package com.cts.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.shop.bill.BillingImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		// Add Items in the Cart
				String[] cart1 = { "Item01", "Item02", "Item03" };
				String[] cart2 = { "Item01", "Item02"};
				
		BillingImpl biller = ac.getBean(BillingImpl.class);
		
		double total = biller.getCartTotal(cart1);
		System.out.println("Cart 1 Total: "+total);
		
		
		total = biller.getCartTotal(cart2);
		System.out.println("Cart 2 Total: "+total);
		
		
	}

}
