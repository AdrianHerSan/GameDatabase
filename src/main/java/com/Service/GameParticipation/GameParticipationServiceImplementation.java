package com.Service.GameParticipation;

import com.Model.GameParticipation;
import com.Repository.GameParticipation.GameParticipationRepository;
import com.Response.GameParticipationResponse;
import com.Service.User.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GameParticipationServiceImplementation implements GameParticipationService{

    Logger logger = LoggerFactory.getLogger(GameParticipationServiceImplementation.class);

    List<Optional<GameParticipation>> games = new ArrayList<>();

    @Autowired
    GameParticipationRepository repository;

    /*@Autowired
    UserService userService;*/

    @Override
    @Transactional
    public GameParticipationResponse saveGameParticipationList(List<GameParticipation> gameParticipationList) {

        try {
            for (GameParticipation game : gameParticipationList) {
                games.add(Optional.of(repository.save(game)));

                //userService.UpdateMatches(game.getUser(), game.isVictory());
            }
            return new GameParticipationResponse(games, HttpStatus.OK, "saveGameParticipationList is done");
        }catch (Exception e){
            logger.error("saveGameParticipationList function is not working");
            return null;
        }
    }

}
