package com.Repository.User;

import com.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Integer>, customUserRepository{

        List<User> findByNickname(String clientInput);

        List<User> findByUsername(String clientInput);

        List<User> findByEmail(String clientInput);

        List<User> findByRanking(Enum clientInput);
}
