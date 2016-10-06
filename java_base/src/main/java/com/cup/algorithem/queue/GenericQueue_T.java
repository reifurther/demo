package com.cup.algorithem.queue;

/**
 * Created by reifurther on 16/10/6.
 */
public class GenericQueue_T {

    public static void main(String[] args) {

        GenericQueue<String> stack = new GenericQueue<String>();

        stack.enqueue("Tome");
        System.out.println("1: " + stack);

        stack.enqueue("Jack");
        System.out.println("2: " + stack);

        stack.enqueue("Rose");
        System.out.println("3: " + stack);

        stack.dequeue();
        System.out.println("4: " + stack);

        //use push

        stack.push("Louis");
        System.out.println("5: " + stack);
        stack.push("Kate");
        System.out.println("6: " + stack);

        stack.dequeue();
        System.out.println("7: " + stack);


        GenericQueue_withArray<String> stackArray = new GenericQueue_withArray<String>();
        stackArray.enqueue("Tome");
        System.out.println("1: " + stackArray);

        stackArray.enqueue("Jack");
        System.out.println("2: " + stackArray);

        stackArray.enqueue("Rose");
        System.out.println("3: " + stackArray);

        stackArray.dequeue();
        System.out.println("4: " + stackArray);

    }
}
