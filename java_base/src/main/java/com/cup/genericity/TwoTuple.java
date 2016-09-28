package com.cup.genericity;

/**
 * Created by reifurther on 16/9/26.
 */
public class TwoTuple<A, B> {

    public final A first;
    public final B second;


    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    public String toString(){
        return "(" + first + " , " + second + ")";
    }
}
