package com.cup.algorithem;

/**
 * Created by reifurther on 16/10/2.
 */
public class Mal_Test {

    public static int[] expandIntArray(int[] ints){

        //expand arr.
        int[] newArr = new int[ints.length * 2];

        for(int i=0; i < ints.length; i++){
            newArr[i] = ints[i];
        }

        ints = newArr;
        return ints;
    }


    public static void main(String[] args) {
        int[] ages = {0,1,2,3,4,5};
        System.out.println("ages's length" + ages.length);
        ages = expandIntArray(ages);
        System.out.println("ages's length: " + ages.length);

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(ages);
        myArrayList.add(2, ages);

        System.out.println(myArrayList.size());

        for(int i=0; i< myArrayList.size(); i++){
            System.out.println("i" + i + " 's value:" + myArrayList.get(i));
        }


    }
}
