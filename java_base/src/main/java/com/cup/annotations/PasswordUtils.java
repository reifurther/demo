package com.cup.annotations;


import java.util.List;

/**
 * Created by reifurther on 2016/10/8.
 */
public class PasswordUtils {

    @UseCase(id = 47, description = "Password must contain at least one numeric.")
    public boolean validatePassword(String password){
        return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id = 48)
    public String encryptPassword(String password){
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description = "New password cannot equal previously used ones.")
    public boolean checkForNewPassword(List<String> prevPassword, String password){
        return !prevPassword.contains(password);

    }


}
