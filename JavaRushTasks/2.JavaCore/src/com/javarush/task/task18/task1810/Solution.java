package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream;
        boolean flag;
        if ((fileInputStream = new FileInputStream(bufferedReader.readLine())).available() < 1000)
            flag = false;
        else flag = true;
        while(flag){
            if ((fileInputStream = new FileInputStream(bufferedReader.readLine())).available() < 1000)
                flag = false;
            else flag = true;
        }
        bufferedReader.close();
        fileInputStream.close();
        throw new DownloadException();
    }

    public static class DownloadException extends Exception {
    }
}
