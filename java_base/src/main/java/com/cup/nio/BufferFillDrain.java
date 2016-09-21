package com.cup.nio;

import java.nio.CharBuffer;

/**
 * Created by reifurther on 16/9/19.
 */
public class BufferFillDrain {

    public static int index = 0;

    public static String[] strings = {
            "I believe i can fly ",
            "I can fly ",
            "I can touch the sky "
    };

    public static boolean fillBuffer(CharBuffer buffer){
        if(strings.length <= index){
            return false;
        }

        String string = strings [index++];

        for (int i=0; i<string.length();i++){
            buffer.put(string.charAt(i));
        }

        return true;
    }

    public static void drainBuffer(CharBuffer buffer){
        while (buffer.hasRemaining()){
            System.out.println(buffer.get());
        }

        System.out.println("");
    }


    public static void main(String[] args) {
        CharBuffer cbuffer = CharBuffer.allocate(100);

        while (fillBuffer(cbuffer)){
            cbuffer.flip();
            drainBuffer(cbuffer);
            cbuffer.clear();
        }
    }
}
