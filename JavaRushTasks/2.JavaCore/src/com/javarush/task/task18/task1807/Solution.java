package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream inputStream = new FileInputStream(fileName);
        int tmp, cnt = 0;
        while (inputStream.available() > 0){
            tmp = inputStream.read();
            if (tmp == 44) cnt++;
        }
        inputStream.close();
        System.out.println(cnt);
    }
}
