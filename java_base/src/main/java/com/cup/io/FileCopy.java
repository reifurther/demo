package com.cup.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by reifurther on 16/9/19.
 */
public class FileCopy {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(
                    "/Users/reifurther/study/github/dracula/dracula-theme/package.json");
            FileOutputStream fos = new FileOutputStream(
                    "/Users/reifurther/study/github/dracula/dracula-theme/package2.json");
            
            byte[] buff = new byte[256];
            int len = 2;
            while((len = fis.read(buff)) > 0){
                fos.write(buff, 0, len);
            }

            fis.close();
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }

    }


}
