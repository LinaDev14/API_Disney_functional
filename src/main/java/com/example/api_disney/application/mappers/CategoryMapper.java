package com.example.api_disney.application.mappers;

import com.example.api_disney.domain.collections.Category;
import com.example.api_disney.domain.dtos.CategoryDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CategoryMapper {

    public Function<Category, CategoryDTO> mapToCategoryDto(){
        return category -> new CategoryDTO(
                category.getCategoryId(),
                category.getCategoryName()
        );
    }

    public Function<CategoryDTO, Category> mapToCategory(){
        return categoryDTO -> new Category(
                null,
                categoryDTO.getCategoryName()
        );
    }
}
