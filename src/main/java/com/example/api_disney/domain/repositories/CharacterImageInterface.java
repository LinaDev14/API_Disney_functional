package com.example.api_disney.domain.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterImageInterface extends MongoRepository<CharacterImage, String> {
}
