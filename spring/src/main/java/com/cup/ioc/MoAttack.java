package com.cup.ioc;

/**
 * Created by reifurther on 16/9/16.
 */
public class MoAttack {

    private Geli geli;

    //1. use constructor injection
//    public MoAttack(Geli geli){
//        this.geli = geli;
//    }

    //2. use setting method injection
    public void setActor(Geli geli){
        this.geli = geli;
    }



    public void cityGateAsk(){
        geli.responseAsk("MoZe is Geli.");
    }

    public static void main(String[] args) {

    }
}
