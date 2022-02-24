package com.Service.Character;

import com.Model.*;
import com.Model.Character;
import com.Response.CharacterResponse;


public interface CharacterService {

    CharacterResponse save(Character character);

    CharacterResponse findbyId(ClientInput clientInput);
}
