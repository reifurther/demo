package com.cup.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by reifurther on 16/10/7.
 */
public class AccountWithoutSync {

    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i=0; i< 100; i++){
            executor.execute(new AddPennyTask());
        }

        executor.shutdown();

        while (!executor.isTerminated()){

        }

        System.out.println("account: " + account.getBalance());
    }

    private static class AddPennyTask implements Runnable {


        @Override
        public void run() {
            account.deposit(1);
        }
    }

    //加锁同步 method1
//    private static class Account {
//
//        private int balance = 0;
//
//        public int getBalance(){
//            return balance;
//        }
//
//        public synchronized void deposit(int amount) {
//            int newBalance = balance + amount;
//
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            balance = newBalance;
//        }
//    }

    //显示加锁同步 metho2

    public static class Account{
        private static Lock lock = new ReentrantLock(); //create a lock
        private int balance = 0;

        public int getBalance(){
            return balance;
        }

        public void deposit(int amount){
            lock.lock();

            int newBalance = balance + amount;

            try {
                Thread.sleep(5);

                balance = newBalance;

            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
