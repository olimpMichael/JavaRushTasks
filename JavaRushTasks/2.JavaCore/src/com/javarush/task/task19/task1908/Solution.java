package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();
        bufferedReader = new BufferedReader(new FileReader(file1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));

        Pattern pattern = Pattern.compile("\\b[0-9]+\\b");
        Matcher matcher;

        while(bufferedReader.ready()){
            String str = bufferedReader.readLine();
            matcher = pattern.matcher(str);
            while(matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                String result = str.substring(start, end + 1);
                bufferedWriter.write(result);
            }
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
