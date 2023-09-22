package com.praveen.movies.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collation = "review")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {

    private ObjectId id;
    private String body;

    public Review(String body) {
        this.body = body;
    }
}
