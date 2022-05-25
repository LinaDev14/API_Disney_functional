package com.example.api_disney.application.mappers;

import com.example.api_disney.domain.collections.Character;
import com.example.api_disney.domain.dtos.CharacterInDTO;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CharacterMapper {

    public Function<Character, CharacterInDTO> mapToCharacterInDto(){
        return character -> new CharacterInDTO(
                character.getCharacterId(),
                character.getCharacterName(),
                character.getCharacterAge(),
                character.getCharacterWeight(),
                character.getCharacterStory()
        );
    }
}
