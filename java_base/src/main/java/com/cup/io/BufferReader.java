package com.cup.io;

import java.io.*;

/**
 * Created by reifurther on 16/9/19.
 */
public class BufferReader {

    public static void main(String[] args) throws IOException {


        InputStream in = new FileInputStream("/Users/reifurther/study/tmp/swfit_r.crt");
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        while(br.read() > 0){
            System.out.println(br.readLine());
        }

        br.close();
    }
}
