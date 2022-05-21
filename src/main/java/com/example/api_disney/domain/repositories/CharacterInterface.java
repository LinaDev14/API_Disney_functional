package com.example.api_disney.domain.repositories;

import com.example.api_disney.domain.collections.Character;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CharacterInterface extends MongoRepository<Character, String> {
}
