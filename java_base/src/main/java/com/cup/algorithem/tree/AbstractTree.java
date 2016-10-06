package com.cup.algorithem.tree;

import java.util.Iterator;

/**
 * Created by reifurther on 16/10/6.
 */
public abstract class AbstractTree<E extends Comparable<E>> implements Tree<E> {

    public void inorder(){

    }

    public void preorder(){

    }

    public void postorder(){

    }

    public boolean isEmpty(){
        return getSize() == 0;
    }

    public Iterator iterator(){
        return null;
    }


}
