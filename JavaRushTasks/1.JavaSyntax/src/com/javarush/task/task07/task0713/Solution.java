package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList <Integer> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20 ; i++){
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }

        ArrayList <Integer> arr3 = new ArrayList<>();
        ArrayList <Integer> arr2 = new ArrayList<>();
        ArrayList <Integer> arr1 = new ArrayList<>();

        for (Integer i: list) {
            if (i % 3 == 0) arr3.add(i);
            if (i % 2 == 0) arr2.add(i);
            if (i % 3 != 0 && i % 2 != 0) arr1.add(i);
        }

        printList(arr3);
        printList(arr2);
        printList(arr1);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
