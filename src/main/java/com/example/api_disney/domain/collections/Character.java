package com.example.api_disney.domain.collections;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Character {

    @Id
    private final String characterId;

    private final String characterName;
    private final Integer characterAge;
    private final Float characterWeight;
    private final String characterStory;

}
