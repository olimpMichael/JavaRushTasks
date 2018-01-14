package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        InputStream inStream = new FileInputStream (str);

        while (inStream.available() > 0){
            int data = inStream.read();
            System.out.print((char) data);
        }

        inStream.close();
        bufferedReader.close();
    }
}