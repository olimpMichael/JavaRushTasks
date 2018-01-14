package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        ArrayList <Integer> list = new ArrayList<>();
        String fileName = new BufferedReader(new InputStreamReader(System.in)).readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        //String str;

        while (bufferedReader.ready()){
            int number = Integer.parseInt(bufferedReader.readLine());
            if (number % 2 == 0){
                list.add(number);
            }
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2) return -1;
                else return 0;
            }
        });

        bufferedReader.close();
        fileInputStream.close();
        for (int i : list) {
            System.out.println(i);
        }
    }
}
