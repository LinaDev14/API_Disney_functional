package com.example.api_disney.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CategoryImageDTO {

    private String categoryImageId;
    private Byte[] categoryImage;
}
