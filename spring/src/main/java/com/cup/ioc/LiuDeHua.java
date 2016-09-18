package com.cup.ioc;

/**
 * Created by reifurther on 16/9/16.
 */
public class LiuDeHua implements Geli {

    public LiuDeHua(){
        System.out.println("My name is LiuDeHua , and I'm actor.");
    }

    @Override
    public void responseAsk(String answer) {
        System.out.println(answer + "from LiuDeHua");
    }
}
