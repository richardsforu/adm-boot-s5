package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.entity.Product;
import com.cts.product.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository prodDao;

	// save A Single Product
	@Override
	public Product saveProduct(Product product) {
		return prodDao.save(product);
	}

	// save list of products
	@Override
	public List<Product> saveProducts(List<Product> products) {
		return prodDao.saveAll(products);
	}

	// list all Products

	@Override
	public List<Product> displayAllProducts() {
		return prodDao.findAll();
	}

	// find a single product by product id

	@Override
	public Product findById(int id) {
		return prodDao.findById(id).orElse(null);
	}

	// delete product by id
	@Override
	public void deleteById(int id) {
		prodDao.deleteById(id);
	}

}
