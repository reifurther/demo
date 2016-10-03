package com.cup.algorithem;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by reifurther on 16/10/3.
 */
public class LinkList_t {

    public static void removeEventVer1(List<Integer> lst){
        int i = 0;
        while (i < lst.size()){
            if ( lst.get(i) % 2 == 0 ){
                lst.remove(i);
            } else {
                i++;
            }
        }
    }

    public static void removeEventVer2(List<Integer> lst){

        for (Integer i: lst){
            if ( i % 2 == 0){
                lst.remove(i);
            }
        }
    }

    public static void removeEventVer3(List<Integer> lst){
        Iterator<Integer> itr = lst.iterator();

        while (itr.hasNext()){
            if(itr.next() % 2 == 0){
                itr.remove();
            }
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        MyArrayList<Integer> myList = new MyArrayList<>();

        LinkedList<Integer> lList = new LinkedList();

        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd:hhmmss:SSS");

        Random ran = new Random(4000);

        for (int i = 0; i < 400000 ; i++){
            lList.add(ran.nextInt());
        }

        System.out.println("begin time : " + df.format(new Date()));

//        removeEventVer1(aList);
//        removeEventVer2(aList); //throw ConcurrentModificationException
//        removeEventVer3(aList);
        removeEventVer3(lList);
        System.out.println("remove time : " + df.format(new Date()));

        for (int i=0 ; i < aList.size(); i++) {
            System.out.println("aList's element:" + aList.get(i));
        }
    }
}
