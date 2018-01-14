package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Борзов1", "Михаил1");
        map.put("Борзов2", "Михаил");
        map.put("Борзов3", "Михаил3");
        map.put("Борзов4", "Михаил4");
        map.put("Борзов5", "Михаил");
        map.put("Борзов6", "Михаил6");
        map.put("Борзов7", "Михаил7");
        map.put("Борзов8", "Михаил");
        map.put("Борзов9", "Михаил9");
        map.put("Борзов10", "Михаил10");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int cnt = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if(name.equals(pair.getValue())) cnt++;
        }
        return cnt;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int cnt = 0;
        for (Map.Entry<String, String> pair: map.entrySet()) {
            if(lastName.equals(pair.getKey())) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
       /* HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Михаил"));
        System.out.println(getCountTheSameLastName(map, "Борзов"));*/
    }
}
