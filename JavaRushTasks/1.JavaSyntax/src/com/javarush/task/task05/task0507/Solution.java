package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int summa = 0;
        int count = 0;
        float result;
        int number = Integer.parseInt(bufferedReader.readLine());
        while (number != -1){
            summa += number;
            count++;
            number = Integer.parseInt(bufferedReader.readLine());
        }
        if (count > 0) result = (float) (summa / (count * 1.0));
        else result = 0;
        /*System.out.println(summa);
        System.out.println(count);*/
        System.out.println(result);
    }
}

