package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int count = 0;
        int symbol;
        while (fis.available() > 0){
            symbol = fis.read();
            if (symbol >= 65 && symbol <= 122) count++;
        }

        System.out.println(count);
        fis.close();
    }
}
