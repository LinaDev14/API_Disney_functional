package com.example.api_disney.domain.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterOutDTO {

    private String characterId;

    private CharacterImage characterImage;
    private String characterName;
    private Integer characterAge;
    private Float characterWeight;
    private String characterStory;
    private List<MediaDTO> listMovies;

}
