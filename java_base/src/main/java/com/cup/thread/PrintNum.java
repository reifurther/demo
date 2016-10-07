package com.cup.thread;

/**
 * Created by reifurther on 16/10/7.
 */
public class PrintNum implements Runnable {

    private int times;

    public PrintNum(int i) {
        this.times = i;
    }

    @Override
    public void run() {
        for (int i=0; i<times; i++){
            System.out.println(" " + i);
            Thread.yield();
        }
    }
}
