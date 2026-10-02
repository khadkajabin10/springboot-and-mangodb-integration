package com.example.learn_mangodb.repository;

import com.example.learn_mangodb.Entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
