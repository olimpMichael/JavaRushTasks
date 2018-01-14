package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        int maxByte = 0;
        int tmp;
        while (inputStream.available() > 0){
            tmp = inputStream.read();
            if (tmp > maxByte) maxByte = tmp;
        }
        System.out.println(maxByte);
        bufferedReader.close();
        inputStream.close();

    }
}
