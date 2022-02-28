package com.Repository.User;

import com.Model.Ranking;
import com.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>, UserRepositoryCustom {

        List<User> findByNickname(String clientInput);

        List<User> findByUsername(String clientInput);

        List<User> findByEmail(String clientInput);

        List<User> findByRanking(Ranking clientInput);



        
}
