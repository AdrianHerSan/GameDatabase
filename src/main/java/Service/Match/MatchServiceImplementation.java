package Service.Match;

import DemoGameDataBase.java.Model.ClientInput;
import DemoGameDataBase.java.Model.Match;
import DemoGameDataBase.java.Repository.Match.MatchRepository;
import DemoGameDataBase.java.Response.MatchResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MatchServiceImplementation implements MatchService {

    List<Optional<Match>> matchList = new ArrayList<>();
    @Autowired
    MatchRepository repository;

    @Override
    public MatchResponse save(Match match) {

        matchList.add(Optional.of(repository.save(match)));

        return new MatchResponse(matchList, HttpStatus.OK,"match is saved");
    }

    @Override
    public MatchResponse findById(ClientInput clientInput) {

        int id = Integer.parseInt(clientInput.getInput());

        matchList.add(repository.findById(id));

        return new MatchResponse(matchList,HttpStatus.OK, "finById on match "+clientInput+"is done");
    }
}
