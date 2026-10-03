package com.example.learn_mangodb;

import com.example.learn_mangodb.Entity.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.BooleanOperators;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.transaction.jta.UserTransactionAdapter;

import java.util.Date;
import java.util.List;

@SpringBootTest
public class MangoTemplateTest  {
    @Autowired
    private MongoTemplate mongoTemplate;
//    @Test
//    public void mangoTemplatTest(){
////        Query query=new Query(
////                Criteria.where("status").in("Ready","PENDING")
////                        .and("totalAmount").gt(5000.0)
////        );
//        Query query=new Query(
//             //building criteria
//             new Criteria().orOperator(
//                     Criteria.where("totalAmount").lte(6000.0),
//                     Criteria.where("status").is("PENDING")
//             )
//        );
//        //now projection with Query
//        query.fields().include("status","id");
//        List<Order> orderList=mongoTemplate.find(query,Order.class);
//        orderList.forEach(System.out::println);
//    }
    @Test
    public  void mangoTemplateUpdateTest(){
        Query query = new Query(
                Criteria.where("status").is("SHIPPED")
        );
        Update update = new Update()
                .set("status", "SHIPPED").set("updatedAt",new Date());

        mongoTemplate.updateMulti(query,update,Order.class);

    }
}
