package com.cup.algorithem.queue;

import java.util.ArrayList;

/**
 * Created by reifurther on 16/10/6.
 */
public class GenericQueue_withArray<E> {
    private ArrayList<E> list = new ArrayList<E>();

    public void enqueue(E e){
        list.add(e);
    }

    public void dequeue(){
        list.remove(0);
    }

    public String toString(){
        return "list : " + list.toString();
    }

}

