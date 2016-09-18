package com.cup.polymorphism;

/**
 * Created by reifurther on 16/9/18.
 */
public class PolymorphismMan {

    public static void main(String[] args) {
        AsianMan aman = new AsianMan();
        EuropMan eman = new EuropMan();

        System.out.println("Asina Man's skin colour: " + aman.skinColor());
        System.out.println("Europe Man's skin colour: " + eman.skinColor());
    }
}
