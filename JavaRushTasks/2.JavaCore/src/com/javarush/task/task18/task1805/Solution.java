package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        FileInputStream inputStream = new FileInputStream(fileName);
        SortedSet<Integer> set = new TreeSet<>();
        while (inputStream.available() > 0){
            set.add(inputStream.read());
        }
        inputStream.close();

        for(Integer i : set){
            System.out.print(i + " ");
        }

    }
}
