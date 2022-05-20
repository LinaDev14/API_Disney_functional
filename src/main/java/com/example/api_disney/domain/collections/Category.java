package com.example.api_disney.domain.collections;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Document
public class Category {

    @Id
    private String characterId;

    private Image image;
    private String characterName;
    private Integer characterAge;
    private Float characterWeight;
    private String characterStory;
    private List<String> characterMediaIds;

}
