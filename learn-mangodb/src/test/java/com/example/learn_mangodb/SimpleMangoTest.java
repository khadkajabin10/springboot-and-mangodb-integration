package com.example.learn_mangodb;

import com.example.learn_mangodb.Entity.Order;
import com.example.learn_mangodb.repository.OrderRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SimpleMangoTest {
    @Autowired
    private org.springframework.core.env.Environment environment;
    @Autowired
    private OrderRepository orderRepository;

//    @Test
//    public void testCreateOrder() {
//
//
//
//        Order order = Order.builder()
//                .status("Ready")
//                .totalAmount(5200.0)
//                .build();
//
//        order = orderRepository.insert(order);
//
//        System.out.println(order);
//    }
//    @Test
//    public  void testGetOrder(){
////        List<Order> orderList=orderRepository.findByStatusAndTotalAmountGreaterThan("Ready",1500.0);
////        orderList.forEach(System.out::println);
//        List<Order> orderList=orderRepository.findOrdersByStatusAndAmount("Ready",5500.0);
//        orderList.forEach(System.out::println);
//    }
    @Test
    public  void deletOrder(){
        List<Order> orderList=orderRepository.findByStatusAndTotalAmountGreaterThan("Ready",1500.0);
        orderList.forEach(System.out::println);

        orderRepository.deleteAll(orderList);
        orderList=orderRepository.findByStatusAndTotalAmountGreaterThan("Ready",1500.0);
        orderList.forEach(System.out::println);
        System.out.println("noting should show");}
}
