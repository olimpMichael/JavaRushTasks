package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("String1");
        list1.add("String2");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("String1");
        list2.add("String2");

        ArrayList<String>[] arrayLists = new ArrayList[]{list1, list2};

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}