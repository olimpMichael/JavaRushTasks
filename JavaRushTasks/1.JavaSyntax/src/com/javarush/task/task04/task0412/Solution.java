package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String str1 = bufferedReader.readLine();
        int i = Integer.parseInt(str1);
        if (i > 0) System.out.println(i * 2);
        else if (i < 0) System.out.println(++i);
        else System.out.println(0);
    }

}