package com.cup.generics;

/**
 * Created by reifurther on 16/9/29.
 */
public class GenericMethods {

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();

        gm.f("S");
        gm.f(1);

    }
}
