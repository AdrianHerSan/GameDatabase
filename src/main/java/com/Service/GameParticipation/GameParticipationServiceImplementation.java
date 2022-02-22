package com.Service.GameParticipation;

import com.Model.GameParticipation;
import com.Repository.GameParticipation.GameParticipationRepository;
import com.Response.GameParticipationResponse;
import com.Response.MatchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GameParticipationServiceImplementation implements GameParticipationService{

    List<Optional<GameParticipation>> games = new ArrayList<>();

    @Autowired
    GameParticipationRepository repository;

    @Override
    public GameParticipationResponse saveGameParticipationList(List<GameParticipation> gameParticipationList) {

        for (GameParticipation game :gameParticipationList)
        {
            games.add(Optional.of(repository.save(game)));
        }
        return new GameParticipationResponse(games, HttpStatus.OK,"saveGameParticipationList is done") ;
    }
}
