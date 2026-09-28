package com.example.learn_mangodb.Entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Builder
@Document(collection = "orders")
@CompoundIndex(
        name = "idx_amount_status",
        def = "{'totalAmount': 1, 'status': 1}"
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
}
