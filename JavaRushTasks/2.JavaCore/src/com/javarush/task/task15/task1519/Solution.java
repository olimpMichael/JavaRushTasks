package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strInput;
        while (!(strInput = bufferedReader.readLine()).equals("exit")){
            try {
                if (strInput.contains(".")) {
                    print(Double.parseDouble(strInput));
                } else if (Integer.parseInt(strInput) > 0 && Integer.parseInt(strInput) < 128) {
                    print(Short.parseShort(strInput));
                } else if (Integer.parseInt(strInput) <= 0 || Integer.parseInt(strInput) >= 128) {
                    print(Integer.parseInt(strInput));
                }
            } catch(NumberFormatException e){
                print(strInput);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
