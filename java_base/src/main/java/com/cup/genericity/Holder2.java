package com.cup.genericity;

import java.util.Objects;

/**
 * Created by reifurther on 16/9/26.
 */
public class Holder2 {

    private Object a;

    public Holder2(Object a){
        this.a = a;
    }

    public void set(Object a){
        this.a = a;
    }

    public Object get(){
        return a;
    }

    public static void main(String[] args) {
        Holder2 h2 = new Holder2(new Automobile());
        Automobile a = (Automobile) h2.get();
        System.out.println(h2.get());

        h2.set("Not an Automobile");
        String s = (String)h2.get();
        System.out.println(s);

        h2.set(0);
        Integer i = (Integer)h2.get();
        System.out.println(i);


    }
}
