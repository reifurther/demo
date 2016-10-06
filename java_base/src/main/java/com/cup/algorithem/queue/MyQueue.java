package com.cup.algorithem.queue;

import java.util.NoSuchElementException;

/**
 * Created by reifurther on 16/10/5.
 */
public class MyQueue {

    public int front;
    public int back;

    public int currentSize = 0;

    public int[] myList;

    public MyQueue(int[] list){
        myList = list;
    }

    public int getFront(int[] x){

        if(x==null){
            throw new NoSuchElementException();
        }

        this.myList = x;

        return front;
    }

    public int getBack(int[] x){

        return back;
    }

    public int getCurrentSize(int[] x){
        return x.length;
    }



    //use int
    public void enQueue(int x){

        if(front < 0 || back < 0){
            throw new NoSuchElementException();
        }

        back++;
        currentSize++;

        myList[back] = x;
    }

    public int deQueue(int front){
        front++;
        back--;
        currentSize--;
        return myList[front];
    }

    public static void main(String[] args) {

        int[] testInts = {1,2,3,4,5};
        MyQueue queue = new MyQueue(testInts);

        queue.enQueue(6);

        for(int i=0; i<testInts.length; i++){
            System.out.println("Int Array list: " + testInts[i]);
        }




    }
}
