package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String str;
        ArrayList<String> list = new ArrayList<String>();
        while((str = bufferedReader.readLine()) != null){
            String[] words = str.split(" ");
            list.addAll(Arrays.asList(words));
        }
        String[] words = list.toArray(new String[list.size()]);
        //Избавляемся от дополнительных лишних символов в словах
        for (int i=0; i<words.length; i++) {
            words[i]=words[i].replaceAll("[^a-zA-Zа-яА-Я-]","");
        }
        bufferedReader.close();
        //...
        StringBuilder result = getLine(words);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder sb = new StringBuilder();
        //Если не было передано ни одного слова, то возвращаем пустой StringBuilder
        if (words.length <= 0) {
            sb.append("");
            return sb;
        }
        Arrays.sort(words);
        boolean[] boolArray = new boolean[words.length];
        boolean flag = false;
        int i = 0;

        outer:
        while (true){
            String first = words[i];
            for (int j = 0; j < words.length; j++){
                String second = words[j];
                char firstChar = first.trim().toLowerCase().charAt(first.length()-1);
                char secondChar = second.trim().toLowerCase().charAt(0);
                if (i != j &&
                        !boolArray[j] &&
                        firstChar == secondChar){
                    if (!flag){
                        sb.append(words[i] + " ");
                    }
                    sb.append(words[j] + " ");
                    boolArray[i] = true;
                    boolArray[j] = true;
                    i = j;
                    flag = true;
                    continue outer;
                }
            }
            break;
        }

        for (int j = 0; j < words.length; j++ ){
            if (!boolArray[j]) sb.append(words[j]);
        }
          return sb;
    }
}