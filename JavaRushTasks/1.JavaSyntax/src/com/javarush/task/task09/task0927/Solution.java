package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Барсик1", new Cat("Барсик-кот1"));
        map.put("Барсик2", new Cat("Барсик-кот2"));
        map.put("Барсик3", new Cat("Барсик-кот3"));
        map.put("Барсик4", new Cat("Барсик-кот4"));
        map.put("Барсик5", new Cat("Барсик-кот5"));
        map.put("Барсик6", new Cat("Барсик-кот6"));
        map.put("Барсик7", new Cat("Барсик-кот7"));
        map.put("Барсик8", new Cat("Барсик-кот8"));
        map.put("Барсик9", new Cat("Барсик-кот9"));
        map.put("Барсик10", new Cat("Барсик-кот10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
