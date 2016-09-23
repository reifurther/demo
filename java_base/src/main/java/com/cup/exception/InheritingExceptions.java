package com.cup.exception;

/**
 * Created by reifurther on 16/9/23.
 */
public class InheritingExceptions {
    public void f() throws SimpleException{
        System.out.println("throw simpleException from f()");
        throw new SimpleException();

    }

    public void g() throws SimpleException{
        System.out.println("throw simpleException from g()");
        throw new SimpleException("Originated in g()");
    }

    public static void main(String[] args) {
        InheritingExceptions ie = new InheritingExceptions();

        try {
            ie.f();
        } catch (SimpleException e) {
            System.out.println("Cought it...");
        }

        try {
            ie.g();
        } catch (SimpleException e) {
            e.printStackTrace();
        }
    }

}
