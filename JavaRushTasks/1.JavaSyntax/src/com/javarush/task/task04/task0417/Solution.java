package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str1 = bufferedReader.readLine();
        String str2 = bufferedReader.readLine();
        String str3 = bufferedReader.readLine();
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int num3 = Integer.parseInt(str3);

        if (num1 == num2 & num1 == num3) System.out.println(num1 + " " + num1 + " " + num1);
        else if (num1 == num2) System.out.println(num1 + " " + num1);
        else if (num1 == num3) System.out.println(num1 + " " + num1);
        else if (num2 == num3) System.out.println(num2 + " " + num2);


    }
}