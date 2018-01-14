package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        String file3 = bufferedReader.readLine();
        bufferedReader.close();

        FileInputStream inputStreamReader1 = new FileInputStream(file2);
        FileInputStream inputStreamReader2 = new FileInputStream(file3);
        FileOutputStream outputStream = new FileOutputStream(file1);

        while (inputStreamReader1.available() > 0){
            outputStream.write(inputStreamReader1.read());
        }

        while (inputStreamReader2.available() > 0){
            outputStream.write(inputStreamReader2.read());
        }

        inputStreamReader1.close();
        inputStreamReader2.close();
        outputStream.close();
    }
}
