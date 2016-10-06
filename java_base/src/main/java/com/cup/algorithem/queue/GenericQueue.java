package com.cup.algorithem.queue;

import java.util.LinkedList;

/**
 * Created by reifurther on 16/10/6.
 */
public class GenericQueue<E> {

    private LinkedList<E> list = new LinkedList<E>();

    public void enqueue(E e){
        list.add(e);
    }

    public void dequeue(){
        list.removeFirst();
    }

    public int getSize(){
        return list.size();
    }

    public void push(E e){
        list.push(e);
    }

    public String toString(){
        return "Queue: " + list.toString();
    }
}
