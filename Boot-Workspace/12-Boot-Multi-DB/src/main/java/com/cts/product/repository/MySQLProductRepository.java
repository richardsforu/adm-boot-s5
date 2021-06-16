package com.cts.product.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.Product;

//@Profile(value = "default")
public interface MySQLProductRepository extends JpaRepository<Product, Integer>{

	
	
}
