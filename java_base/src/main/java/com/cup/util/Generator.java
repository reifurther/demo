package com.cup.util;

/**
 * Created by reifurther on 16/9/29.
 */
public interface Generator<T> {

    //定义泛型接口, next()方法的返回类型是参数化的T
    T next();
}
