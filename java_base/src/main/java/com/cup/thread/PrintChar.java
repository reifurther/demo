package com.cup.thread;

/**
 * Created by reifurther on 16/10/7.
 */
public class PrintChar implements Runnable {

    private char charToPrint;
    private int times;

    public PrintChar(char c, int t) {
        this.charToPrint = c;
        this.times = t;
    }

    @Override
    public void run() {
        for (int i=0; i<times; i++){
            System.out.println(charToPrint);

            if (i >=10){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
