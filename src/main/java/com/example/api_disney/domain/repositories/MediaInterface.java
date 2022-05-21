package com.example.api_disney.domain.repositories;

import com.example.api_disney.domain.collections.Media;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MediaInterface extends MongoRepository<Media, String> {
}
