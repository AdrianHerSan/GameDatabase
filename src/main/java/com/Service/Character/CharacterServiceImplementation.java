package com.Service.Character;

import com.Model.Character;
import com.Model.ClientInput;
import com.Repository.Character.CharacterRepository;
import com.Response.CharacterResponse;
import com.Response.MatchResponse;
import com.Response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CharacterServiceImplementation implements CharacterService{

    List<Optional<Character>> characterList = new ArrayList<>();

    @Autowired
    CharacterRepository repository;

    @Override
    public CharacterResponse save(Character character) {

        characterList.add(Optional.of(repository.save(character)));

        return new CharacterResponse(characterList, HttpStatus.OK, "Character save is done");
    }

    @Override
    public CharacterResponse findbyId(ClientInput clientInput) {
        int id = Integer.parseInt(clientInput.getInput());

        characterList.add(repository.findById(id));

        return new CharacterResponse(characterList, HttpStatus.OK, "finById on match "+clientInput+"is done");
    }
}
