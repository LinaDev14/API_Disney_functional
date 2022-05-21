package com.example.api_disney.domain.repositories;

import com.example.api_disney.domain.collections.CharacterMediaBinding;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterMediaBindingInterface extends MongoRepository<CharacterMediaBinding, String> {
}
