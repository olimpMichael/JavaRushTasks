package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);
        int tmp = 0, minByte = Integer.MAX_VALUE;

        while (inputStream.available() > 0){
            tmp = inputStream.read();
            if (tmp < minByte) minByte = tmp;
        }
        System.out.println(minByte);

        bufferedReader.close();
        inputStream.close();
    }
}
