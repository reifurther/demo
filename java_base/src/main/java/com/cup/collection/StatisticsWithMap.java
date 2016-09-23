package com.cup.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by reifurther on 16/9/23.
 */
public class StatisticsWithMap {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer,Integer> m = new HashMap<Integer, Integer>();
        for(int i=0; i<1000; i++){
            int r = rand.nextInt(20);
            Integer freq = m.get(r);
            m.put(r, freq == null ? 1: freq+1);
        }
        System.out.println(m);
    }
}
