package com.example.api_disney.application.mappers;

import com.example.api_disney.domain.collections.Character;
import com.example.api_disney.domain.dtos.CharacterInDTO;
import com.example.api_disney.domain.dtos.CharacterOutDTO;
import com.example.api_disney.domain.dtos.MediaDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.BiFunction;
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


    public Function<CharacterInDTO, Character> mapToCharacter(){
        return characterInDTO -> new Character(
                null,
                characterInDTO.getCharacterName(),
                characterInDTO.getCharacterAge(),
                characterInDTO.getCharacterWeight(),
                characterInDTO.getCharacterStory()

        );
    }

    public BiFunction<Character, List<MediaDTO>, CharacterOutDTO> mapToCharacterOutDto(){
        return (character, mediaDTOS) -> new CharacterOutDTO(
                character.getCharacterId(),
                character.getCharacterName(),
                character.getCharacterAge(),
                character.getCharacterWeight(),
                character.getCharacterStory(),
                mediaDTOS
        );
    }
}
