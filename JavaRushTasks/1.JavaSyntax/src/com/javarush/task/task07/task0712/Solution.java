package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0; i<10; i++){
            list.add(bufferedReader.readLine());
        }
        int min=list.get(0).length(), max=list.get(0).length();
        for (int i=0; i<list.size(); i++){
            if (min > list.get(i).length()) min = list.get(i).length();
            if (max < list.get(i).length()) max = list.get(i).length();
        }

        for (int i=0; i<list.size(); i++){
            if (list.get(i).length() == min || list.get(i).length() == max) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
