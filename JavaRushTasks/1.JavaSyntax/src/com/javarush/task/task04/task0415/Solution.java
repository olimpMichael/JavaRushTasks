package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String strA = bufferedReader.readLine();
        int a = Integer.parseInt(strA);
        String strB = bufferedReader.readLine();
        int b = Integer.parseInt(strB);
        String strC = bufferedReader.readLine();
        int c = Integer.parseInt(strC);


        if ((a + b > c) & (a + c > b) & (c + b > a)) System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");
    }
}