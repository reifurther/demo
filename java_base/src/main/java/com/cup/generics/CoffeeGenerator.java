package com.cup.generics;

import com.cup.util.Generator;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by reifurther on 16/9/29.
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {

    public Class[] types = {Latte.class, Mocha.class, Cappuccino.class};

    public static Random rand = new Random(47);

    public CoffeeGenerator(){

    }

    private int size = 0;
    public CoffeeGenerator(int s) {
        size = s;
    }

    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        }  catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {

        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {

            count--;
            return CoffeeGenerator.this.next();
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    @Override
    public void forEach(Consumer<? super Coffee> action) {

    }

    @Override
    public Spliterator<Coffee> spliterator() {
        return null;
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for(int i=0; i< 5; i++){
            System.out.println(gen.next());
        }

        System.out.println("---");

        for(Coffee c : new CoffeeGenerator(5)){
            System.out.println(c);
        }
    }
}
