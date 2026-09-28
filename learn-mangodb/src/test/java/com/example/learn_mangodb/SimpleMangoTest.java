package com.example.learn_mangodb;

import com.example.learn_mangodb.Entity.Order;
import com.example.learn_mangodb.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SimpleMangoTest {
    @Autowired
    private org.springframework.core.env.Environment environment;
    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void testCreateOrder() {
        System.out.println(
                "AUTO INDEX = " +
                        environment.getProperty("spring.data.mongodb.auto-index-creation")
        );


        Order order = Order.builder()
                .status("Ready")
                .totalAmount(5200.0)
                .build();

        order = orderRepository.insert(order);

        System.out.println(order);
    }
}
