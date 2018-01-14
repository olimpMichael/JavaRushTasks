package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static{
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        //bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "cp1251"));
        bufferedReader = new BufferedReader(new FileReader(fileName));
        String str;

        while((str = bufferedReader.readLine()) != null){
            Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<Integer, String> pair = iterator.next();
                String number = "" + pair.getKey();
                String value = pair.getValue();
                if (str.contains(number)){
                    str = str.replaceAll("\\b" + number + "\\b", value);
                }
            }
            System.out.println(str);
        }
        bufferedReader.close();
    }
}
