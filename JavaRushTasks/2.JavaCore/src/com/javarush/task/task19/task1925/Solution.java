package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        FileWriter bufferedWriter = new FileWriter(args[1]);
        String str;
        //Pattern pattern = Pattern.compile("[a-zA-Zа-яА-Я]{7,}");
        Pattern pattern = Pattern.compile("(?<=\\s|^)\\S{7,}(?=\\s|$)");
       //Pattern pattern = Pattern.compile("(\\W|\\w){7,}");
        StringBuilder sb = new StringBuilder();
        while((str = bufferedReader.readLine()) != null){
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()){
                sb.append(matcher.group() + ",");
            }
        }
        sb.setLength(sb.length()-1);
        //System.out.println(sb);
        bufferedWriter.write(sb.toString());
        bufferedReader.close();
        bufferedWriter.close();
    }
}
