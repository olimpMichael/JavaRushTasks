package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        bufferedReader = new BufferedReader(new FileReader(fileName));
        String str;

        while((str = bufferedReader.readLine()) != null){
            String[] lines = str.split(" ");
            int count = 0;
            for (String s : lines) {
                for (String word : words){
                    if (s.equals(word)) count++;
                }
            }
            if (count == 2) {
                System.out.println(str);
            }
        }
        bufferedReader.close();
    }
}
