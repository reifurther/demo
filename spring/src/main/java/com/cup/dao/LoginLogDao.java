package com.cup.dao;

import com.cup.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


/**
 * Created by reifurther on 16/9/19.
 */

@Repository
public class LoginLogDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertLoginLog(LoginLog loginLog){

        String sqlStr = "insert into t_login_log(user_id,ip,login_datetime) " +
                        "values(?,?,?)";

        jdbcTemplate.update(sqlStr,new java.lang.Object[]
                {loginLog.getUserId(), loginLog.getIp(), loginLog.getLoginDate()});

    }
}
