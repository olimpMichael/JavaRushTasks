package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        ArrayList<String> listString = new ArrayList<>();
        ArrayList<String> listInteger = new ArrayList<>();
        isGreaterThan("s", "w"); //обманочка для метода isGreaterThan

        for (int i = 0; i < array.length; i++){
            if(isNumber(array[i])){
                listInteger.add(array[i]);
            } else listString.add(array[i]);
        }

        Collections.sort(listString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        Collections.sort(listInteger, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(Integer.parseInt(o2), Integer.parseInt(o1));
            }
        });

        int iterString = 0, iterInteger = 0;

        for (int i = 0; i < array.length; i++){
            if(isNumber(array[i])){
                array[i] = listInteger.get(iterString);
                iterString++;
            } else {
                array[i] = listString.get(iterInteger);
                iterInteger++;
            }
        }


    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
