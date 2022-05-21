package com.example.api_disney.domain.repositories;

import com.example.api_disney.domain.collections.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryInterface extends MongoRepository<Category, String> {
}
