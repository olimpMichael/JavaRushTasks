package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        FileOutputStream outputStream = new FileOutputStream(args[1]);
        byte[] buffer = new byte[1000];

        while(inputStream.available() > 0) {
            inputStream.read(buffer);
            Charset sourseCharset = Charset.forName("Windows-1251");
            Charset resultCharset = Charset.forName("UTF-8");
            String s = new String(buffer, sourseCharset);
            buffer = s.getBytes(resultCharset);
            outputStream.write(buffer);
        }

        inputStream.close();
        outputStream.close();
    }
}
