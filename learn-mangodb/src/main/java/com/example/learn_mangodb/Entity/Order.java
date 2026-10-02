package com.example.learn_mangodb.Entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@Document(collection = "orders")
@CompoundIndex(
        name = "idx_amount_status",
        def = "{'totalAmount': 1, 'status': 1}"
)
@CompoundIndex(
        name = "idx_address_city",
        def = "{'address.city': 1}"
)
public class Order {
    @Id
    private  String id;

    private  Double totalAmount;
    @Indexed
   private String status;
   @CreatedDate
    private LocalDateTime createdAt;
 @LastModifiedDate
    private LocalDateTime updatedAt;
 private Address address;
 @DBRef
    private List<Product> products;
}
/*
Embed When:
The data is always accessed together
The embedded data doesn't change independently
The relationship is one-to-few (not one-to-millions)
You want atomic updates on the entire document
Reference When:
The data has its own lifecycle
Multiple documents need to share the same data
The relationship is one-to-many or many-to-many
The referenced data changes frequently
You need to query the data independently
 */
