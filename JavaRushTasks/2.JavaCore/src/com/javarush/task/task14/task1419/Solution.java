package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код
        exceptions.add(new Exception());
        exceptions.add(new RuntimeException());
        exceptions.add(new IOException());
        exceptions.add(new IllegalAccessException());
        exceptions.add(new NullPointerException());
        exceptions.add(new FileNotFoundException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new InstantiationException());
        exceptions.add(new SQLException());


    }
}
