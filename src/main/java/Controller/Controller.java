package Controller;

import DemoGameDataBase.java.Model.ClientInput;
import DemoGameDataBase.java.Model.Match;
import DemoGameDataBase.java.Model.User;
import DemoGameDataBase.java.Response.MatchResponse;
import DemoGameDataBase.java.Response.UserResponse;
import DemoGameDataBase.java.Service.Match.MatchService;
import DemoGameDataBase.java.Service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    UserService userService;

    @Autowired
    MatchService matchService;

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

    @GetMapping("/matchhistory")
    public MatchResponse match(@RequestBody ClientInput clientInput){

        MatchResponse matchResponse = matchService.findById(clientInput);
        return matchResponse;
    }

    @GetMapping("/search")
    public UserResponse search(@RequestBody ClientInput clientInput){

        return userService.findBy(clientInput);
    }
}
