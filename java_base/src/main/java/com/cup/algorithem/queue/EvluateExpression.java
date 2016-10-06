package com.cup.algorithem.queue;

import org.w3c.dom.events.EventException;

import java.util.StringTokenizer;

/**
 * Created by reifurther on 16/10/6.
 */
public class EvluateExpression {

    public static void main(String[] args) {
        if (args.length<1){
            System.out.println("Usage: java EvaluateExpression expression");
        }
        System.exit(0);
    }

    private static int evaluteExpression(String expression){
        GenericQueue<Integer> operandStack = new GenericQueue<Integer>();
        GenericQueue<Character> operatorStack = new GenericQueue<Character>();

        StringTokenizer tokens = new StringTokenizer(expression, "()+-/*", true);

        while (tokens.hasMoreTokens()){
            String token = tokens.nextToken().trim();
            if (token.length() == 0){
                continue;
            }else if (token.charAt(0) == '+' || token.charAt(0) == '-'){

            }
        }

        return 0;
    }
}
