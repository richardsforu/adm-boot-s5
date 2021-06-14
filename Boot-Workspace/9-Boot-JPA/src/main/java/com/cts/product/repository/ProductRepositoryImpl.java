package com.cts.product.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
public class ProductRepositoryImpl {

	// SessionFactory / EntityManager

	@PersistenceContext
	private EntityManager em;

	public List<Product> findAll() {
		return em.createQuery("from Product").getResultList();
	}

	public void save(Product product) {
		em.persist(product);
	}

	public Product findById(int id) {
		return em.find(Product.class, id);
	}

}
