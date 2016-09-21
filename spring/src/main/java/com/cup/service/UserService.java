package com.cup.service;

import com.cup.dao.LoginLogDao;
import com.cup.dao.UserDao;
import com.cup.domain.LoginLog;
import org.springframework.beans.factory.annotation.Autowired;
import com.cup.domain.User;
import org.springframework.stereotype.Service;

/**
 * Created by reifurther on 16/9/19.
 */

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private LoginLogDao loginLogDao;

    public boolean hasMatchUser(String userName, String password){
        int matchCount = userDao.getMatchCount(userName,password);
        return matchCount > 0;
    }

    public User findUser(String userName){
        return userDao.findUser(userName);
    }

    public void loginSuccess(User user){
        user.setCredits(5 + user.getCredits());

        LoginLog loginLog = new LoginLog();
        loginLog.setUserId(user.getUserId());
        loginLog.setIp(user.getLastIp());
        loginLog.setLoginDate(user.getLastVisit());

        userDao.updateUserLoginLog(user);
        loginLogDao.insertLoginLog(loginLog);
    }

}
