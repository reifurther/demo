package com.cup.genericity;

/**
 * Created by reifurther on 16/9/26.
 */
public class Holder3<T> {

    private T t;

    public Holder3(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public void set(T t){
        this.t = t;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
        Automobile a = h3.get();
        a.toS();

        Holder3<String> h3s = new Holder3<String>(new String());
        h3s.set("Its String");
        System.out.println(h3s.get());

    }
}
