package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int year = Integer.parseInt(str);
        if (year % 100 == 0 & year % 400 == 0 || year % 4 ==0 & year % 100 != 0  ) System.out.println("количество дней в году: 366");
        else System.out.println("количество дней в году: 365");
    }
}