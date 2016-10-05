package com.cup.algorithem;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by reifurther on 16/10/3.
 */
public class MyLinkedList<AnyType> implements Iterable<AnyType> {

    private int theSize;
    private int modCount = 0;
    private Node<AnyType> beginMarker;
    private Node<AnyType> endMarker;

    private static class Node<AnyType>{
        private AnyType data;
        private Node<AnyType> prev;
        private Node<AnyType> next;

        public Node(AnyType d, Node<AnyType> p, Node<AnyType> n){
            data = d;
            prev = p;
            next = n;
        }
    }

    public MyLinkedList(){
        doClear();
    }

    private void doClear() {
        beginMarker = new Node<AnyType>(null, null, null);
        endMarker = new Node<AnyType>(null, beginMarker, null);
        beginMarker.next = endMarker;

        theSize = 0;
        modCount++;
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
        addBefore(getNode(idx, 0, size()), x);
    }

    public void addBefore(Node<AnyType> p, AnyType x){
        Node<AnyType> newNode = new Node<>(x, p.next, p);
        newNode.prev.next = newNode;
        p.prev = newNode;

        theSize++;
        modCount++;
    }

    public AnyType get(int idx){
        return getNode(idx).data;
    }

    public AnyType set(int idx, AnyType newVal){
        Node<AnyType> p = getNode(idx);
        AnyType oldVal = p.data;
        p.data = newVal;
        return oldVal;
    }

    public AnyType remove(int idx){
        return remove(getNode(idx));
    }

    public AnyType remove(Node<AnyType> p){
        p.next.prev = p.prev;
        p.prev.next = p.next;

        theSize--;
        modCount++;

        return p.data;
    }

    private Node<AnyType> getNode(int idx){
        return getNode(idx, 0, size()-1);
    }

    private Node<AnyType> getNode(int idx, int lower, int upper){

        Node<AnyType> p ;

        if(idx < lower || idx > upper){
            throw new IndexOutOfBoundsException();
        }

        if(idx < size()/2){
            p = beginMarker.next;
            for(int i=0; i<idx; i++){
                p = p.next;
            }
        }else{
            p = endMarker;
            for(int i=size(); i>idx; i--){
                p = p.prev;
            }
        }

        return p;
    }


    @Override
    public Iterator<AnyType> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<AnyType>{

        private Node<AnyType> current = beginMarker.next;
        private int expectModCount = modCount;
        private boolean okToRemove = false;

        @Override
        public boolean hasNext() {
            return current != endMarker;
        }

        @Override
        public AnyType next() {

            if(modCount != expectModCount){
                throw new ConcurrentModificationException();
            }

            if(!hasNext()){
                throw  new NoSuchElementException();
            }

            AnyType nextItem = current.data;
            current = current.next;
            okToRemove = true;

            return nextItem;
        }

        @Override
        public void remove() {

            if(modCount != expectModCount){
                throw new ConcurrentModificationException();
            }

            if(!okToRemove){
                throw new IllegalStateException();
            }

            MyLinkedList.this.remove(current.prev);
            expectModCount++;
            okToRemove = false;

        }
    }
}
