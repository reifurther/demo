package com.cup.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by reifurther on 16/9/19.
 */
public class RandomAccess {

    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("/Users/reifurther/study/tmp/swfit_r.crt","rw");

        for(int i=0; i < raf.length() ; i++){
            byte[] buff = new byte[20];
            byte b = raf.readByte();

            char c = (char) b;

            if (c == 'C') {
                raf.seek(i);
                raf.write('A');
            }
        }

        raf.close();
        System.out.println("Random access file over.");

    }
}
