package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 100);
        map.put("2", 500);
        map.put("3", 600);
        map.put("4", 200);
        map.put("5", 300);
        map.put("6", 700);
        map.put("7", 800);
        map.put("8", 400);
        map.put("9", 900);
        map.put("10", 1500);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<String, Integer>(map);
        Iterator<Map.Entry<String, Integer>> iterator = copy.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            if(pair.getValue() < 500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}