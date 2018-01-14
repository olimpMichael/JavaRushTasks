package com.javarush.task.task13.task1319;

import java.io.*;

/*
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        BufferedWriter bufWriter = new BufferedWriter(new FileWriter(fileName));
        String str = bufferedReader.readLine();
        while (!str.equals("exit")){
            bufWriter.write(str + "\r\n");
            str = bufferedReader.readLine();
            // bufWriter.flush();
        }
        bufWriter.write("exit");

        bufferedReader.close();
        bufWriter.close();
    }
}
