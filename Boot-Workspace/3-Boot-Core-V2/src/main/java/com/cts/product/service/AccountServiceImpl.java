package com.cts.product.service;

import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements ProductService{

	@Override
	public void findAll() {
		System.out.println(">>>> AccountServiceImpl:: findAll");
	}

	@Override
	public void findById() {
		System.out.println(">>>> AccountServiceImpl:: findById");
		
	}
	
	

}
