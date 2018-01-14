package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        String result;
        if (number < 1 || number >999) return;
        if (number > 99 ) result = "трехзначное число";
        else if (number < 100 & number > 9) result = "двузначное число";
        else result = "однозначное число";

        if (number % 2 == 0) System.out.println("четное " + result);
        else System.out.println("нечетное " + result);
    }
}
