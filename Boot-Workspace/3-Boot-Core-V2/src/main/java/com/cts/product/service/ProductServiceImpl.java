package com.cts.product.service;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

	@Override
	public void findAll() {
		System.out.println(">> ProductServiceImpl:: findAll");

	}

	@Override
	public void findById() {
		System.out.println(">> ProductServiceImpl:: findById");

	}

}
