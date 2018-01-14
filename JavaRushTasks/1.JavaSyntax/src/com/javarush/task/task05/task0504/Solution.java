package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat vaska = new Cat("Vaska", 1, 10, 10);
        Cat murzik = new Cat("Murzik", 3, 15, 12);
        Cat barsik = new Cat("Barsik", 2, 8, 5);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}