package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        bufferedReader = new BufferedReader(new FileReader(file1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));

        while (bufferedReader.ready()){
            char symbol = (char)bufferedReader.read();
            if (Character.isAlphabetic(symbol) || Character.isDigit(symbol) || Character.isSpaceChar(symbol))
                bufferedWriter.write(symbol);
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
