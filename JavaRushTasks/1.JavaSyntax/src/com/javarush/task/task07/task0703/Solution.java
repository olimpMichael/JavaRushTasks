package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stringArr = new String[10];
        int[] intArr = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<10; i++){
            stringArr[i] = bufferedReader.readLine();
            intArr[i] = stringArr[i].length();
        }

        for (int i : intArr) {
            System.out.println(i);
        }
    }
}
