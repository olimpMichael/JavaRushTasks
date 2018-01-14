package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(bufferedReader.readLine());
        int num2 = Integer.parseInt(bufferedReader.readLine());
        int num3 = Integer.parseInt(bufferedReader.readLine());
        int tmp;
        if (num1 < num2){
            tmp = num2;
            num2 = num1;
            num1 = tmp;
        }
        if (num2 < num3){
            tmp = num3;
            num3 = num2;
            num2 = tmp;
        }
        if (num1 < num3){
            tmp = num3;
            num3 = num1;
            num1 = tmp;
        }

        if (num1 < num2){
            tmp = num2;
            num2 = num1;
            num1 = tmp;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
