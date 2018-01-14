package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++){
            list.add(bufferedReader.readLine());
        }

        int strLength = list.get(0).length();

        for (int i = 0; i < list.size(); i++){
            if (strLength > list.get(i).length()) {
                System.out.println(i);
                break;
            }
            strLength = list.get(i).length();
        }
    }
}

