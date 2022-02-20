package Repository.User;

import DemoGameDataBase.java.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

        List<User> findByNickname(String clientInput);

        List<User> findByUsername(String clientInput);

        List<User> findByEmail(String clientInput);

        List<User> findByRanking(Enum clientInput);
}
