package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Миша");
        map.put("2", "2");
        map.put("1", "3");
        map.put("4", "4");
        map.put("5", "Миша");
        map.put("6", "6");
        map.put("1", "7");
        map.put("8", "8");
        map.put("9", "9");
        map.put("10", "Миша");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
