package com.Service.Match;

import com.Model.ClientInput;
import com.Model.Match;
import com.Response.MatchResponse;

public interface MatchService {
    MatchResponse save(Match match);

    MatchResponse findById(ClientInput clientInput);
}
