package com.cup.generics;

/**
 * Created by reifurther on 16/9/29.
 */
public class Coffee {

    private static long counter = 0;
    private final long id = counter++;

    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }

}
