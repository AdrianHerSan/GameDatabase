package com.Service.User;

import com.Model.ClientInput;
import com.Model.User;
import com.Repository.User.UserRepository;
import com.Response.UserResponse;
import com.Service.GameParticipation.GameParticipationService;
import com.Service.Ranking.RankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    private Optional<List<User>> userList = Optional.of(new ArrayList<>());

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RankingService rankingService;


    @Override
    public UserResponse register(User user) {

        userRepository.save(user);

        userList.ifPresent(list-> list.clear());

        userList.ifPresent(list ->
                list.add(user));

        return new UserResponse(userList, HttpStatus.OK, "register is done");
    }

    @Override
    public UserResponse findBy(ClientInput clientInput) {

        userList.ifPresent(list-> list.clear());

        switch (clientInput.getCriteria()) {
            case nickname:
                return findByNickname(clientInput.getInput());
            case username:
                return findByUsername(clientInput.getInput());
            case email:
                return findByEmail(clientInput.getInput());
            case ranking:
                return findByRanking(clientInput.getInput());
            default:
                return new UserResponse(null, HttpStatus.OK, "Incorrect Criteria field");
        }
    }

    @Override
    public UserResponse findByNickname(String clientInput) {

        userList.ifPresent(list ->
                list.addAll(userRepository.findByNickname(clientInput)));

        return new UserResponse(userList, HttpStatus.OK, "findByNickName is done");
    }

    @Override
    public UserResponse findByUsername(String clientInput) {

        userList.ifPresent(list -> list.addAll(userRepository.findByUsername(clientInput)));

        return new UserResponse(userList, HttpStatus.OK, "findByUsername is done");
    }

    @Override
    public UserResponse findByEmail(String clientInput) {

        userList.ifPresent(list ->
                list.addAll(userRepository.findByEmail(clientInput)));
        return new UserResponse(userList, HttpStatus.OK, "findByEmail is done");
    }

    @Override
    public UserResponse findByRanking(String clienInput) {
        //convert String to Integer for getById
        Integer id = Integer.parseInt(clienInput);

        userList.ifPresent(list-> //get the ranking by her id and then use it to findByRanking
                list.addAll(userRepository.findByRanking(rankingService.getById(id))));

        return new UserResponse(userList, HttpStatus.OK, "findByRanking is done");
    }

    @Override
    //update the columns for matches and victories and recalculate the new ranking of the player
    public void updateMatches(Integer id, boolean victory) {
        try{

            User user = userRepository.getById(id);

            Integer matches = user.getTotalmatches();
            Integer victories = user.getVictories();

            if(victory){
                victories ++;
                user.setVictories(victories);
            }

            matches ++;

            user.setTotalmatches(matches);

            //recalculate de new ranking
            user.setRanking(rankingService.getById(updateRanking(victories)));

            userRepository.updateMatches(user);

        }catch (Exception e){
            System.out.println("invalid id on updateMatches = "+id);
        }
    }

    @Override
    public Integer updateRanking(Integer victories) {

        if(victories <= 5){
            return 4;
        }else if(victories<=10) {
            return 1;
        }else if (victories <= 20){
            return 2;
        }else{
            return 3;
        }

    }

}
