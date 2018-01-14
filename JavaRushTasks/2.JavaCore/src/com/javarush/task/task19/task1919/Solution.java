package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        try {
            /*BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(args[0]), "Cp1251"));*/
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader(args[0]));
            Map<String, Double> map = new TreeMap<>();
            Pattern patternName = Pattern.compile("[a-zA-Zа-яА-Я_]+");
            //Pattern patternValue = Pattern.compile("");
            while(bufferedReader.ready()) {
                String str = bufferedReader.readLine();
                //System.out.println(str);
                Matcher matcher = patternName.matcher(str);
                matcher.find();
                //System.out.println(matcher.group());
                String name = str.substring(0, matcher.end());
                Double value = Double.parseDouble(str.substring(matcher.end(), str.length()).trim());
                if (map.containsKey(name)){
                    Double oldValue = map.get(name);
                    map.put(name, value + oldValue);
                } else map.put(name, value);
            }
            bufferedReader.close();

            Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<String, Double> pair = iterator.next();
                System.out.println(pair.getKey() + " " + pair.getValue());
            }


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
