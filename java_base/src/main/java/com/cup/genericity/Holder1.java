package com.cup.genericity;

/**
 * Created by reifurther on 16/9/26.
 */
public class Holder1 {

    private Automobile a;

    public Holder1(Automobile a){
        this.a = a;
    }

    Automobile get(){
        return a;
    }
}
