package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int key;
        int count;
        char symbol;
        while((key = inputStream.read()) != -1){
            if (!map.containsKey(key)){
                map.put(key, 1);
            } else {
                count = map.get(key);
                map.put(key, ++count);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        Map.Entry<Integer, Integer> pair;
        while(iterator.hasNext()){
            pair = iterator.next();
            symbol = (char)(int) pair.getKey();
            System.out.println(symbol + " " + pair.getValue());
        }
        inputStream.close();

    }
}
