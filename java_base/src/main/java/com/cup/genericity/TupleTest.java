package com.cup.genericity;

/**
 * Created by reifurther on 16/9/29.
 */
public class TupleTest {

    static TwoTuple<String, Integer> f(){
        return new TwoTuple<String, Integer>("hi", 47);
    }

    static ThreeTuple<Automobile, String, Integer> g(){
        return new ThreeTuple<Automobile, String, Integer>(new Automobile(), "hii", 48);
    }

    public static void main(String[] args) {
        System.out.println(f().toString());

        System.out.println(g().toString());
    }
}
