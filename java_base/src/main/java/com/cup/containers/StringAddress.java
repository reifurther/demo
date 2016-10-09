package com.cup.containers;

/**
 * Created by reifurther on 2016/10/9.
 */
public class StringAddress {
    private String s;

    public StringAddress(String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}
