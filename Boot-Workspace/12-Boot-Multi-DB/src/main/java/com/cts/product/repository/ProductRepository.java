package com.cts.product.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.cts.product.document.Product;
@Profile(value = "mongo")
public interface ProductRepository extends MongoRepository<Product, Object>{

}
