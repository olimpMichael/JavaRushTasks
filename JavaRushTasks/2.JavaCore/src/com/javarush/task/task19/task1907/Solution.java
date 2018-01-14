package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        FileReader reader = new FileReader(fileName);
        bufferedReader  = new BufferedReader(reader);
        Pattern pattern = Pattern.compile("\\bworld\\b");   // создаем регулярку. "\\b" означает "край слова"
        Matcher matcher;
        int count = 0;
        while (bufferedReader.ready()){             // пока есть чего читать
            matcher = pattern.matcher(bufferedReader.readLine());   // считывем строоку и суем её вот в "искатель"
            while (matcher.find()){                 // пока в нашей считанной строке есть совпадения с регуляркой
                count++;                            // инкрементируем счётчик
            }
        }

        System.out.println(count);
        reader.close();
    }
}
