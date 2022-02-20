package com.Service.User;

import com.Model.ClientInput;
import com.Model.User;
import com.Repository.User.UserRepository;
import com.Response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    private Optional<List<User>> userList = Optional.of(new ArrayList<>());

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserResponse register(User user) {

        userRepository.save(user);

        userList.ifPresent(list ->
                list.add(user));

        return new UserResponse(userList, HttpStatus.OK, "register is done");
    }

    @Override
    public UserResponse findBy(ClientInput clientInput) {
        switch (clientInput.getCriteria()) {
            case nickname:
                return findByNickname(clientInput.getInput());
            case username:
                return findByUsername(clientInput.getInput());
            case email:
                return findByEmail(clientInput.getInput());
            case ranking:
                //return findByRanking(clientInput.getInput());
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

   /* @Override
    public UserResponse findByRanking(String clientInput) {

        userList.ifPresent(list -> list.addAll(userRepository.findByRanking(User.Rank.valueOf(clientInput.toLowerCase()))));

        return new UserResponse(userList, HttpStatus.OK, "findByRanking is done");
    }*/
}
