package com.example.learn_mangodb.repository;

import com.example.learn_mangodb.Entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order,String> {
}
