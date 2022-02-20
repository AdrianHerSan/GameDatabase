package Service.User;

import DemoGameDataBase.java.Model.ClientInput;
import DemoGameDataBase.java.Model.User;
import DemoGameDataBase.java.Response.UserResponse;

public interface UserService {

    UserResponse register(User user);

    UserResponse findBy(ClientInput clientInput);
    UserResponse findByNickname(String clientInput);
    UserResponse findByUsername(String clientInput);
    UserResponse findByEmail(String clientInput);
    //UserResponse findByRanking(String cientInput);
}
