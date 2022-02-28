package com.Service.User;




import com.Model.*;
import com.Response.*;

import java.util.List;

public interface UserService {

    UserResponse register(User user);

    UserResponse findBy(ClientInput clientInput);

    UserResponse findByNickname(String clientInput);

    UserResponse findByUsername(String clientInput);

    UserResponse findByEmail(String clientInput);

    UserResponse findByRanking(String clienInput);

    void updateMatches(Integer id, boolean victory);

    Integer updateRanking(Integer victories);

}
