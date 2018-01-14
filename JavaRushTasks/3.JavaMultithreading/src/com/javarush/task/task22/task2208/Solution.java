package com.javarush.task.task22.task2208;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", null);
        map.put("country", null);
        map.put("city", null);
        map.put("age", null);
        System.out.println(getQuery(map));
    }
    public static String getQuery(Map<String, String> params) {
        Iterator<Map.Entry<String, String>> iterator = params.entrySet().iterator();
        StringBuilder sb = new StringBuilder();
        try {
            while (iterator.hasNext()) {
                Map.Entry<String, String> pair = iterator.next();
                if (pair.getValue() != null) {
                    String str = String.format("%s = '%s'", pair.getKey(), pair.getValue());
                    sb.append(str);
                    sb.append(" and ");
                }
            }
            sb.delete(sb.length() - 5, sb.length());
        } catch(StringIndexOutOfBoundsException e){
            sb = new StringBuilder("");
        }
        return sb.toString();
    }
}
