package com.Controller;

import com.Model.*;
import com.Model.Character;
import com.Response.*;
import com.Service.Character.CharacterService;
import com.Service.GameParticipation.GameParticipationService;
import com.Service.Match.MatchService;
import com.Service.Ranking.RankingService;
import com.Service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class Controller {

    int al;
    @Autowired
    UserService userService;

    @Autowired
    MatchService matchService;

    @Autowired
    CharacterService characterService;

    @Autowired
    GameParticipationService gameParticipationService;

    @Autowired
    RankingService rankingService;

    @PostMapping("/register")
    public UserResponse register(@RequestBody User user){

        UserResponse userResponse = userService.register(user);

        return userResponse;
    }

    @PostMapping("/newmatch")
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

        //search by filter having user's input and one of the criteria
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

    @PostMapping("/GameParticipation/CreateList")
    public GameParticipationResponse GameParticipationList(@RequestBody List<GameParticipation> gamesList){

        GameParticipationResponse gameParticipationResponse = gameParticipationService.saveGameParticipationList(gamesList);

        return gameParticipationResponse;
    }


}
