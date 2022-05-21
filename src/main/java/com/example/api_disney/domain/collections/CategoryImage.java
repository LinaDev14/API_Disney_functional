package com.example.api_disney.domain.collections;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class CategoryImage {

    @Id
    private final String categoryImageId;
    private final Byte[] categoryImage;
}
