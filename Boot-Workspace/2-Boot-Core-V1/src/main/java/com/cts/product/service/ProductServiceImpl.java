package com.cts.product.service;

import org.springframework.stereotype.Service;

@Service(value = "s1")
public class ProductServiceImpl implements ProductService {
	
	@Override
	public void saveProduct() {
		System.out.println(">>>>>> ProductServiceImpl::saveProduct called");
	}
	

}
