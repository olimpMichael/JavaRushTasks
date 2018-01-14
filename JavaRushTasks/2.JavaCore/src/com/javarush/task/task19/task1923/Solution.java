package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        FileWriter fileWriter = new FileWriter(args[1]);
        String str;
        Pattern pattern = Pattern.compile("(.*)[0-9]+(.*)");
        while ((str = bufferedReader.readLine()) != null){
            String[] words = str.split(" ");
            for (String word : words) {
                Matcher matcher = pattern.matcher(word);
                if (matcher.find()){
                    fileWriter.write(word + " ");
                }
            }
        }
        bufferedReader.close();
        fileWriter.close();
    }
}
