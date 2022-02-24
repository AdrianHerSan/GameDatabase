package com.Service.GameParticipation;

import com.Model.GameParticipation;
import com.Response.GameParticipationResponse;


import java.util.List;

public interface GameParticipationService {

   GameParticipationResponse saveGameParticipationList(List<GameParticipation> gameParticipationList);
   Integer changeRanking(Integer id);

}
