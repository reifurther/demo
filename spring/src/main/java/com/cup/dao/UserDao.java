package com.cup.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import com.cup.domain.User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by reifurther on 16/9/19.
 */

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int getMatchCount(String userName, String password){

        String sqlStr = "select count(*) from t_user " +
                        "where user_name=? and password=? ";

        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(sqlStr, new Object[]{userName, password});

        System.out.println("matchCount: " + rowSet.getRow());
        return rowSet.getRow();

    }

    public User findUser(String userName){
        String sqlStr = "select user_id, user_name, credits " +
                        "from t_user where user_name=? " ;

        final User user = new User();

        jdbcTemplate.query(sqlStr, new Object[]{userName}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setUserId(resultSet.getInt("user_id"));
                user.setUserName(resultSet.getString("user_name"));
                user.setCredits(resultSet.getInt("credits"));
            }
        });

        return user;
    }

    public void updateUserLoginLog(User user){
        String sqlStr = "update t_user set last_visit=?,last_ip=?credits=? " +
                        "where user_id=? ";
        jdbcTemplate.update(sqlStr, new Object[]{user.getLastVisit(), user.getLastIp(), user.getCredits()});
    }

}
