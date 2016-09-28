package com.cup.controller;

import com.cup.repository.UserRepository;
import com.cup.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import com.cup.domain.User;

import java.util.Date;

/**
 * Created by reifurther on 16/9/19.
 */

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loginPage(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView checkLogin(HttpServletRequest request, LoginCommand loginCommand){

        boolean isValidUser = userService.hasMatchUser(loginCommand.getUserName(),loginCommand.getPassword());

        if(!isValidUser){
            return new ModelAndView("login", "error", "user name or password error.");
        }else{
            User user = userService.findUser(loginCommand.getUserName());
            user.setLastIp(request.getRemoteAddr());
            user.setLastVisit(new Date());

            userService.loginSuccess(user);
            request.getSession().setAttribute("user", user);

            return new ModelAndView("index");

        }


    }


}
