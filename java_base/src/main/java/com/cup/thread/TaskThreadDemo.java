package com.cup.thread;

/**
 * Created by reifurther on 16/10/7.
 */
public class TaskThreadDemo {

    public static void main(String[] args) {

        int TIMES = 20;

        Runnable printA = new PrintChar('a', TIMES);
        Runnable printB = new PrintChar('b', TIMES);

        Runnable print100 = new PrintNum(TIMES);

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(print100);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
