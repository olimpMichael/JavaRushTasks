package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<10; i++){
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        int tmp = 0;
        for (int i=0; i<5; i++){
            tmp = array[i];
            array[i] = array[9-i];
            array[9-i] = tmp;
        }

        for (int i:array) {
            System.out.println(i);
        }
    }
}

