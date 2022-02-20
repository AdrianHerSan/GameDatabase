package Response;

import DemoGameDataBase.java.Model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Getter
@Setter
public class UserResponse {

    private Optional<List<User>> userList;

    private HttpStatus status;

    private String description;
}
