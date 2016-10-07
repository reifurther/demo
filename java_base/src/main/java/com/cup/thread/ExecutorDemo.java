package com.cup.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by reifurther on 16/10/7.
 */
public class ExecutorDemo {

    private static final int TIMES = 20;

    public static void main(String[] args) {

        /**
         * 1. nThreads = 1, 相当于单线程，顺序执行
         * 2. nThreads = n, 并发
         */
//        ExecutorService executor = Executors.newFixedThreadPool(1);

        /**
         * newCachedThreadPool 为每个任务创建新的线程，（相当于并发）
         */
        ExecutorService executor = Executors.newCachedThreadPool();

        executor.execute(new PrintChar('a', TIMES));
        executor.execute(new PrintChar('b', TIMES));

        executor.execute(new PrintNum(TIMES));

        executor.shutdown();
    }
}
