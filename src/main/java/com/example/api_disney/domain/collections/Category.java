package com.example.api_disney.domain.collections;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Category {

    @Id
    private final String categoryId;
    private final String categoryName;


}
