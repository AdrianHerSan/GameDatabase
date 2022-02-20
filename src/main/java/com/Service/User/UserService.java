package com.Service.User;


import com.Model.ClientInput;
import com.Model.User;
import com.Response.UserResponse;

public interface UserService {

    UserResponse register(User user);

    UserResponse findBy(ClientInput clientInput);
    UserResponse findByNickname(String clientInput);
    UserResponse findByUsername(String clientInput);
    UserResponse findByEmail(String clientInput);
    //UserResponse findByRanking(String cientInput);
}
