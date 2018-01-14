package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        FileInputStream inputStream1 = new FileInputStream(file1);
        byte[] buffer = new byte[inputStream1.available()];
        if (inputStream1.available() > 0) {
            inputStream1.read(buffer);
        }
        inputStream1.close();

        FileInputStream inputStream2 = new FileInputStream(file2);
        FileOutputStream outputStream = new FileOutputStream(file1);
        while (inputStream2.available() > 0) {
            outputStream.write(inputStream2.read());
        }
        outputStream.write(buffer);

        inputStream2.close();
        outputStream.close();
    }
}
