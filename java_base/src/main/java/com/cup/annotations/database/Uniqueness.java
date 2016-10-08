package com.cup.annotations.database;

/**
 * Created by reifurther on 2016/10/8.
 */

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
