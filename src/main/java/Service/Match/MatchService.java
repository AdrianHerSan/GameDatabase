package Service.Match;

import DemoGameDataBase.java.Model.ClientInput;
import DemoGameDataBase.java.Model.Match;
import DemoGameDataBase.java.Response.MatchResponse;
import org.springframework.stereotype.Service;

public interface MatchService {
    MatchResponse save(Match match);

    MatchResponse findById(ClientInput clientInput);
}
