package com.cts.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.entity.Product;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	
	//find all Products by Name
	
	//Product findByName(String name);
	// Find all the products qwith given alphabet
	
	List<Product> findByNameLike(String name);
	
	// List all Products by price between 0 and 1500
	
	List<Product> findByPriceBetween(double minPrice,double maxPrice);
	
	List<Product> findByPriceGreaterThanEqual(double price);
	
	List<Product> findByNameLikeAndPriceGreaterThanEqual(String s1,double d);
	
	// JPQL Queries
	
	// Find all products

	@Query(value = "from Product")
	List<Product> allProducts();
	
	//@Query("from Product p where p.price>= :price")
	//List<Product> filter1(double price);
	
	
	//@Query("from Product p where p.price>= :p1")
	//List<Product> filter1(@Param("p1") double price);

	
	@Query("from Product p where p.price>= :price")
    List<Product> filter1(@Param("price") double p1);
	
	
	@Query(value ="select * from product",nativeQuery = true)
	List<Product> filter2();
	
	
	// DML using Query
	
	
	@Modifying
	@Query("update Product p set p.name= :name,p.price= :price,p.description= :description where p.id= :id")
	void updateProduct(String name,double price,String description,int id);
	
	
	
	
	
	
	
	
	
	
}
