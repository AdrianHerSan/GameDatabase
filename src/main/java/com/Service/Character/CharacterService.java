package com.Service.Character;

import com.Model.Character;
import com.Model.ClientInput;
import com.Response.CharacterResponse;
import com.Response.UserResponse;

public interface CharacterService {

    CharacterResponse save(Character character);

    CharacterResponse findbyId(ClientInput clientInput);
}
