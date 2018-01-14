package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();
        FileReader reader = new FileReader(file1);
        FileWriter writer = new FileWriter(file2);
        int cnt = 1 ;

        while(reader.ready()){
            int symbol = reader.read();
            if ((cnt % 2) == 0 ){
                writer.write(symbol);
            }
            cnt++;
        }
        reader.close();
        writer.close();
    }
}