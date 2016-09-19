package com.cup.datatype;

import java.math.BigDecimal;

/**
 * Created by reifurther on 16/9/18.
 */
public class Precision {

    public static double add(double v1, double v2){
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    public static double substract(double s1, double s2){
        BigDecimal b1 = new BigDecimal(Double.toString(s1));
        BigDecimal b2 = new BigDecimal(Double.toString(s2));
        return b1.subtract(b2).doubleValue();
    }

    public static double multiply(double m1, double m2){
        BigDecimal b1 = new BigDecimal(Double.toString(m1));
        BigDecimal b2 = new BigDecimal(Double.toString(m2));
        return b1.multiply(b2).doubleValue();
    }

    public static double divide(double d1, double d2){
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.divide(b2,BigDecimal.ROUND_HALF_UP).doubleValue();
    }


    public static void main(String[] args) {
        System.out.println("precision add: " + Precision.add(3.01, 0.990100000000000400281));
        System.out.println("normal add: " + (2.01 + 3.0001));

        System.out.println("precision substract: " + Precision.substract(3.0001, 2.01));
        System.out.println("normal substract: " + (3.0001 - 2.01));

        System.out.println("precision multiply: " + Precision.multiply(3.0001, 2.01));
        System.out.println("normal multiply: " + (3.0001 * 2.01));

        System.out.println("precision divide: " + Precision.divide(3.0001, 2.01));
        System.out.println("normal divide: " + (3.0001 / 2.01));

        System.out.println("2.0-1.1:" + (2.0-1.1));

    }

}
