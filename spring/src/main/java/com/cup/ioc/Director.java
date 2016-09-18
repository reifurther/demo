package com.cup.ioc;

/**
 * Created by reifurther on 16/9/16.
 */
public class Director {
    public void direct(){
        Geli geli = new LiuDeHua();

//        MoAttack ma = new MoAttack(geli);
        MoAttack ma = new MoAttack();
        ma.setActor(geli);
        ma.cityGateAsk();

    }

    public static void main(String[] args) {
        Director director = new Director();
        director.direct();
    }
}
