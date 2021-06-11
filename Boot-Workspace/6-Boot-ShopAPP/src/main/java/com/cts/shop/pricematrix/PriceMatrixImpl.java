package com.cts.shop.pricematrix;

import org.springframework.stereotype.Repository;

import com.cts.shop.pricematrix.PriceMattrix;

//Dependency class
@Repository
public class PriceMatrixImpl implements PriceMattrix {

	// 
	public PriceMatrixImpl() {
		System.out.println(">>> PriceMatrixImpl object is created...");
	}

	@Override
	public double getItemPrice(String itemCode) {
		// code to fetch item price from database for the given itemCode
		return 100.00;

	}

}
