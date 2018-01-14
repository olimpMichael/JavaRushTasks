package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        bufferedReader = new BufferedReader(new FileReader(fileName));
        String str;

        while ((str = bufferedReader.readLine()) != null){
            StringBuilder sb = new StringBuilder();
            for(int i = str.length() - 1; i >= 0; i--){
                sb.append(str.charAt(i));
            }
            System.out.println(sb.toString());
        }

        bufferedReader.close();
    }
}
