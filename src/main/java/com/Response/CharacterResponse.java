package com.Response;

import com.Model.Character;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Getter
@Setter
public class CharacterResponse {

    private List<Optional<Character>> characterList;

    private HttpStatus status;

    private String description;
}
