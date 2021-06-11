package com.cts.shop.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.shop.pricematrix.PriceMattrix;


//Dependent
@Service
public class BillingImpl {
	
	
	@Autowired
	private PriceMattrix price; // dependency class ref
	

	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl(); // dependency

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;
	}

}
