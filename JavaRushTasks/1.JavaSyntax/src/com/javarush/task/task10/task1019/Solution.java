package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();

        while(true) {
            String str = reader.readLine();
            if(str.isEmpty()){
                break;
            }
            int id = Integer.parseInt(str);
            String name = reader.readLine();
            hashMap.put(name, id);
        }

        for (Map.Entry<String, Integer> pair : hashMap.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
