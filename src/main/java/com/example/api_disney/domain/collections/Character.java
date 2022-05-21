package com.example.api_disney.domain.collections;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Character {

    @Id
    private String characterId;

    private Image image;
    private String characterName;
    private Integer characterAge;
    private Float characterWeight;
    private String characterStory;

}
