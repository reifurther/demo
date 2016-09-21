package com.cup.controller;

import org.springframework.stereotype.Controller;

/**
 * Created by reifurther on 16/9/19.
 */

public class LoginCommand {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
