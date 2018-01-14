package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator iterator = cats.iterator();
        if (iterator.hasNext()) {
            Cat cat = (Cat) iterator.next();
            cats.remove(cat);
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        HashSet<Cat> set = new HashSet<Cat>();
        set.add(new Cat("Барсик"));
        set.add(new Cat("Трупик"));
        set.add(new Cat("Мурка"));
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1
    public static class Cat{
        String name;
        Cat(){
            name = "Кошак";
        }
        Cat(String name){
            this.name = name;
        }

        /*public String toString(){
            return name;
        }*/
    }
}
