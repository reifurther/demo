package com.cup.algorithem.tree;

import java.util.Iterator;

/**
 * Created by reifurther on 16/10/6.
 */
public interface Tree<E extends Comparable<E>> {

    public boolean search(E e);

    public boolean insert(E e);

    public boolean delete(E e);

    //中序
    public void inorder();

    //前序
    public void preorder();

    //后序
    public void postorder();

    public int getSize();

    public boolean isEmpty();

    public Iterator iterator(); //返回遍历元素的迭代器

    public void clear();


}
