package com.Controller;

import com.Model.Character;
import com.Model.ClientInput;
import com.Model.Match;
import com.Model.User;
import com.Response.CharacterResponse;
import com.Response.MatchResponse;
import com.Response.UserResponse;
import com.Service.Character.CharacterService;
import com.Service.Match.MatchService;
import com.Service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.text.normalizer.UCharacter;

@RestController
public class Controller {

    @Autowired
    UserService userService;

    @Autowired
    MatchService matchService;

    @Autowired
    CharacterService characterService;

    @PostMapping("/register")
    public UserResponse register(@RequestBody User user){

        UserResponse userResponse = userService.register(user);

        return userResponse;
    }

    @PostMapping("/match")
    public MatchResponse match(@RequestBody Match match){

        MatchResponse matchResponse = matchService.save(match);
        return matchResponse;
    }

    @GetMapping("/matchConsult")
    public MatchResponse matchConsult(@RequestBody ClientInput clientInput){

        MatchResponse matchResponse = matchService.findById(clientInput);
        return matchResponse;
    }

    @GetMapping("/search")
    public UserResponse search(@RequestBody ClientInput clientInput){

        return userService.findBy(clientInput);
    }

    @PostMapping("/createCharacter")
    public CharacterResponse createCharacter(@RequestBody Character character){

        CharacterResponse characterResponse = characterService.save(character);

        return characterResponse;
    }

    @GetMapping("/championData")
    public CharacterResponse championData(@RequestBody ClientInput clientInput){

        return characterService.findbyId(clientInput);
    }
}
