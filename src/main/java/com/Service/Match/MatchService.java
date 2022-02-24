package com.Service.Match;

import com.Model.*;
import com.Model.Match;
import com.Response.MatchResponse;

public interface MatchService {
    MatchResponse save(Match match);

    MatchResponse findById(ClientInput clientInput);
}
