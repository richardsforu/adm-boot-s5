package com;

import com.shop.bill.BillingImpl;
import com.shop.pricematrix.PriceMatrixImpl;

public class Test {

	/*
	 * Basic types of objects in java? 
	 * 1. Dependency Object : object who doesn't
	 * depends on other objects 
	 * 2. Dependent Object : Who always depends on
	 * dependency objects
	 * 
	 */
	public static void main(String[] args) {

		// Add Items in the Cart
		String[] cart1 = { "Item01", "Item02", "Item03" };
		String[] cart2 = { "Item01", "Item02"};

		// get Dependency class object
		
		PriceMatrixImpl price=new PriceMatrixImpl(); // Dependency object

		// Pass cart object to biller

		BillingImpl biller = new BillingImpl(); // Dependent
		
		biller.setPrice(price); // Injecting / passing dependency obeject (price) to the dependent object (biller) is called DI
		
		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);
		
		
		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);

	}

}
