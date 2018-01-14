package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Миша");
        map.put("2", "Вася");
        map.put("3", "Коля");
        map.put("4", "Миша");
        map.put("5", "Дима");
        map.put("6", "Коля");
        map.put("7", "Миша");
        map.put("8", "Настя");
        map.put("9", "Ася");
        map.put("10", "Алена");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copyFirst = new HashMap<String, String>(map);
        HashMap<String, String> copySecond = new HashMap<String, String>(map);
        Iterator<Map.Entry<String, String>> iterator = copyFirst.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            String key = pair.getKey();
            copySecond.remove(key);
            if (copySecond.containsValue(value)) removeItemFromMapByValue(map, value);
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        /*HashMap<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);*/
    }
}
