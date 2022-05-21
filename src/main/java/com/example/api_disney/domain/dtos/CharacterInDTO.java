package com.example.api_disney.domain.dtos;

import com.example.api_disney.domain.collections.CharacterImage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterInDTO {

    private String characterId;

    private CharacterImage characterImage;
    private String characterName;
    private Integer characterAge;
    private Float characterWeight;
    private String characterStory;
}