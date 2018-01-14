package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            int n = Integer.parseInt(bufferedReader.readLine());
            list.add(n);
        }

        Integer before = null;
        int count = 1;
        int max = 1;
        for (Integer i : list){
            if (i.equals(before)) count++;
            else {
                if (max < count) {
                    max = count;
                }
                count = 1;
            }
            before = i;
           /* System.out.println("before = " + before);
            System.out.println("count = " + count);
            System.out.println("max = " + max);*/
        }
        if (max < count) {
            max = count;
        }
        System.out.println(max);



    }
}