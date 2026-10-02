package com.example.learn_mangodb.repository;

import com.example.learn_mangodb.Entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface OrderRepository extends MongoRepository<Order,String> {
List<Order> findByStatusAndTotalAmountGreaterThan(String string,Double db);
    List<Order> findByAddressCity(String string);
    @Query("{ 'status': ?0, 'totalAmount': ?1 }")
    List<Order> findOrdersByStatusAndAmount(String status, Double amount);

 @Query(
         value = "{ 'address.city': ?0 }",
         fields = "{ '_id': 1, 'totalAmount': 1 }"
 )
    List<Order> findByCity(String city);
}

