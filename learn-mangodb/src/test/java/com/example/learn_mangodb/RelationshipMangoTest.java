package com.example.learn_mangodb;

import com.example.learn_mangodb.Entity.Address;
import com.example.learn_mangodb.Entity.Order;
import com.example.learn_mangodb.Entity.Product;
import com.example.learn_mangodb.repository.OrderRepository;
import com.example.learn_mangodb.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RelationshipMangoTest {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository;
//    @Test
//    public void testCreateOrder() {
//        Product laptop = Product.builder()
//                .name("Gaming Laptop")
//                .category("Electronics")
//                .price(1299.99)
//
//                .build();
//        laptop = productRepository.save(laptop);
//        Product phone = Product.builder()
//                .name("Samsung s24")
//                .category("Electronics")
//                .price(25000.0)
//
//                .build();
//        laptop = productRepository.save(phone);
//
//
//
//
//        Order order = Order.builder()
//                .status("Ready")
//                .totalAmount(1400.0+25200.0)
//                .products(List.of(laptop,phone))
//                .address(
//                        Address.builder()
//                                .line1("kageshowri")
//                                .city("Kathmandu")
//                                .state("Bagmati")
//                                .zipCode("44600")
//                                .country("Nepal")
//                                .build()
//                )
//                .build();
//
//        order = orderRepository.insert(order);
//
//        System.out.println(order);
//    }
    @Test
    public  void testOrderFetch(){
//        List<Order> orderList=orderRepository.findByAddressCity("Kathmandu");
        List<Order> orderList=orderRepository.findByCity("Kathmandu");

        orderList.forEach(System.out::println);
    }
}
