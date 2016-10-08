package com.cup.annotations;

/**
 * Created by reifurther on 2016/10/8.
 */
public class Testable {

    public void execute(){
        System.out.println("Executing...");
    }

    @Test
    void testExecute(){
        execute();
    }
}
