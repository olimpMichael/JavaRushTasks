package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        FileInputStream inputStream = new FileInputStream(file1);
        FileWriter outputStream = new FileWriter(file2);
        Scanner scanner = new Scanner(inputStream);

        double tmp;
        int result;
        while(scanner.hasNext()){
            tmp = scanner.nextDouble();
            result = (int) Math.round(tmp);
            outputStream.write(result + " ");
        }

        inputStream.close();
        outputStream.close();
    }
}
