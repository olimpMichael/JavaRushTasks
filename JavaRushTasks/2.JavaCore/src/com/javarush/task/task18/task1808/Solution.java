package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        String file3 = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream1 = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3);

        int length = inputStream.available();
        if (length > 0) {
            byte[] buffer = new byte[length];
            if (length % 2 == 0) {
                inputStream.read(buffer);
                outputStream1.write(buffer, 0 , length / 2);
                outputStream2.write(buffer, length / 2, length / 2);
            } else {
                inputStream.read(buffer);
                outputStream1.write(buffer, 0 , length / 2 + 1);
                outputStream2.write(buffer, length / 2 + 1, length / 2);
            }
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
