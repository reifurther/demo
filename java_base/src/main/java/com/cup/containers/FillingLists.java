package com.cup.containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by reifurther on 2016/10/9.
 */
public class FillingLists {

    public static void main(String[] args) {

        List<StringAddress> list = new ArrayList<StringAddress>(
                Collections.nCopies(4, new StringAddress("Hello")));

        System.out.println(list);

        Collections.fill(list, new StringAddress("Word!"));
        System.out.println(list);
    }

}
