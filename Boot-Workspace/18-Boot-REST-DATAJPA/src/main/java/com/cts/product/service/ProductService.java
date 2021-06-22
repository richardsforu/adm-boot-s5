package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	// save A Single Product
	Product saveProduct(Product product);

	// save list of products
	List<Product> saveProducts(List<Product> products);

	List<Product> displayAllProducts();

	Product findById(int id);

	// delete product by id
	void deleteById(int id);

}