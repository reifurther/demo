package com.cup.algorithem;

import java.util.Iterator;

/**
 * Created by reifurther on 16/10/3.
 */
public class MyLinkedList<AnyType> implements Iterable<AnyType> {

    private int theSize;

    private static class Node<AnyType>{

    }

    public MyLinkedList(){
        doClear();
    }

    private void doClear() {
    }

    public void clear(){
        doClear();
    }

    public  int size(){
        return theSize;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public boolean add(AnyType x){
        add(size(), x);
        return true;
    }

    public void add(int idx, AnyType x){

    }



    @Override
    public Iterator<AnyType> iterator() {
        return null;
    }
}
