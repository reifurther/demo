package com.cup.repository;

import com.cup.domain.User;
import com.cup.model.TUserEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by reifurther on 16/9/23.
 */

@Repository
public interface UserRepository extends JpaRepository<TUserEntity, Integer> {

    //match user
    boolean hasMatchUser(String userName, String password);

    //find user
    User findUser(String userName);

    //login successes
    void loginSuccess(User user);
}
