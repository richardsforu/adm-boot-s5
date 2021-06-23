package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@RestController
@RequestMapping("api/products")
@CrossOrigin
public class ProductRestController {
	
	@Autowired
	private ProductService ps;

	// list all Products
	@GetMapping
	public List<Product> listAll() {
		return ps.displayAllProducts();
	}

	// save a product
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		return ps.saveProduct(product);
	}
	// save multiple products
	@PostMapping("/saveAll")
	public List<Product> saveAllProducts(@RequestBody List<Product> products){
		return ps.saveProducts(products);
	}
	
	
	@GetMapping("/{id}")
	public Product findById(@PathVariable int id) {
		return ps.findById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable int id) {
		ps.deleteById(id);
	}
	
	
	

}
