package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

/*
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = bufferedReader.readLine();
            String str = input.split("\\?")[1];
            String[] parameters = str.split("\\&");
            String objParameter = null;
            String s;
            for (int i = 0; i < parameters.length; i++) {
                s = parameters[i];
                if (s.contains("obj="))  objParameter = s.substring(s.indexOf("=")+1);
                if (s.contains("=")) System.out.print(s.substring(0, s.indexOf("=")));
                else System.out.print(s);
                System.out.print(" ");
            }

            if (objParameter != null){
                System.out.println("");
                try {
                    Double d = Double.parseDouble(objParameter);
                    alert(d);
                } catch (NumberFormatException e){
                    e.printStackTrace();
                    alert(objParameter);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
