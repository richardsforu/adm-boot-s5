package com.shop.bill;

import com.shop.pricematrix.PriceMatrixImpl;

//Dependent
public class BillingImpl {
	
	private PriceMatrixImpl price; // dependency class ref
	
	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}

	
	/*
	 * 	Design Issues
	 * -------------------
	 * 1. Too many Dependency object creations
	 * 		-> memory issues
	 * 		-> perf of application goes down
	 * 
	 *  Why this issue happened?
	 *  --------------------------
	 *  -> Dependent class itself creating dependency class object directly
	 *  
	 *  What is the solution?
	 *  ------------------------
	 *  -> Do not create dependency objects in the dependent class directly
	 * 	-> Instead, use Like JNDI  lookup techniques
	 *  
	 *  Issues with JNDI 
	 *  ------------------
	 *  -> JNDI location is tightly binded with Dependent class
	 *  
	 *  What is the best solution?
	 *  ------------------------------
	 *  -> Do not create or find, instead ask some one (Container) to inject / pass as parameter (IoC-Inversion of control)
	 *  
	 *  How to get objects from container
	 *  -----------------------------------
	 *  -> using Dependency Injection (DI)
	 *  
	 *  What is Dependency Injection (DI)?
	 *  -------------------------------------
	 *  -> Injecting dependency to dependent object (DI)
	 *  i.e : Who needs whom?
	 *  	-> dependent object BillingIml needs dependency object PriceMatric
	 *  
	 *   How to implement DI?
	 *   ----------------------
	 *   -> two ways
	 *   1. Setter based DI
	 *   2. Constructor based DI
	 *   
	 *   1. Setter based DI
	 *   ---------------------
	 *   Rules
	 *   -----
	 *   	-> Create Dependency class reference in the Dependent class at class level
	 *   	-> create setter for the above defined dependency reference
	 *  
	 * 
	 * 
	 * 
	 * 
	 */
	
	

	



	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl(); // dependency

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;
	}

}
