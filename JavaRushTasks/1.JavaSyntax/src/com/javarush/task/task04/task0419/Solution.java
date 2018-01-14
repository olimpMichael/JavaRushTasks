package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        int num3 = Integer.parseInt(bufferedReader.readLine());
        int num4 = Integer.parseInt(bufferedReader.readLine());
        int result = num1;
        if (num2 >= result) result = num2;
        if (num3 >= result) result = num3;
        if (num4 >= result) result = num4;
        System.out.println(result);

    }
}
