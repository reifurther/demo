package com.cup.annotations.database;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by reifurther on 2016/10/8.
 */
public class TableCreator {

    public static void main(String[] args) throws ClassNotFoundException {
        if (args.length < 1){
            System.out.println("arguments: annotated classes.");
            System.exit(0);
        }

        for (String className : args){
            Class<?> cl = Class.forName(className);
            DBTable dbTable = cl.getAnnotation(DBTable.class);

            if (dbTable == null){
                System.out.println("No DBTable annotations in class " + className);
                continue;
            }

            String tableName = dbTable.name();

            if(tableName.length() < 1) {
                tableName = cl.getName().toUpperCase();
            }

            List<String> columnDefs = new ArrayList<String>();

        }
    }
}
