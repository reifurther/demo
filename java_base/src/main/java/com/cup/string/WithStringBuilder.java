package com.cup.string;

/**
 * Created by reifurther on 16/9/26.
 */
public class WithStringBuilder {
    public String Implicit(String[] fields){
        String result = "";
        for(int i=0; i<fields.length; i++){
            result += fields[i];
        }
        return result;
    }

    public String explicit(String[] fields){
        StringBuffer result = new StringBuffer();
        for(int i=0; i<fields.length; i++){
            result.append(fields[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {

    }
}
