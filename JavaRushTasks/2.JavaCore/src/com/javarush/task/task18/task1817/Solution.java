package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int countSymbols = fis.available();
        int countSpace = 0;
        while (fis.available() > 0){
            if (fis.read() == 32) countSpace++;
        }
        double result = countSpace * 1.0/ countSymbols * 100;
        /*System.out.println(countSpace);
        System.out.println(countSymbols);
        System.out.println(countSpace * 1.0/ countSymbols * 100);*/
        System.out.println(String.format("%.2f", result));

        fis.close();
    }
}
