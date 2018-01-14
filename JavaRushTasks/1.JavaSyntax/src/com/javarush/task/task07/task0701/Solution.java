package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        int[] nums = new int[20];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<nums.length; i++){
            nums[i] = Integer.parseInt(bufferedReader.readLine());
        }
        return nums;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int max = array[0];
        for (int i : array ) {
            if (max < i) max = i;
        }
        return max;
    }
}
