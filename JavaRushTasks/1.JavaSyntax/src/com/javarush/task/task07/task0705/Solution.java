package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[20];
        int[] littleArr1= new int[10];
        int[] littleArr2= new int[10];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<20; i++){
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }

        for (int i=0; i<10; i++){
            littleArr1[i] = array[i];
            littleArr2[i] = array[i+10];
        }

        for (int i : littleArr2) {
            System.out.println(i);
        }
    }
}
