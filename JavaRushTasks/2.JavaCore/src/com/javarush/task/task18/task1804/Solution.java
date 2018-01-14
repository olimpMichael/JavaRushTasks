package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        FileInputStream inputStream = new FileInputStream(fileName);
        HashMap<Integer, Integer> map = new HashMap<>();

        int key;
        int count;
        int minCount = Integer.MAX_VALUE;

        while(inputStream.available() > 0){
            key = inputStream.read();
            if (!map.containsKey(key)){
                map.put(key, 1);
                minCount = 1;
            } else {
                count = map.get(key);
                map.put(key, ++count);

            }
        }
        inputStream.close();
        Map.Entry<Integer, Integer> pair;
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            pair = iterator.next();
            if (pair.getValue() < minCount) minCount = pair.getValue();
            }


        iterator =  map.entrySet().iterator();
        while(iterator.hasNext()) {
            pair = iterator.next();
            if (pair.getValue().equals(minCount)) {
                System.out.print(pair.getKey() + " ");
            }
        }
    }
}
