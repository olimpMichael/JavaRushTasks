package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String lastName;
        private int age;
        private String address;
        private boolean sex;
        private String education;

        public Human(String name, int age, String education) {
            this.name = name;
            this.age = age;
            this.education = education;
        }

        public Human(String name, String lastName, int age, boolean sex) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String lastName, boolean sex) {

            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String name, String lastName, String address) {
            this.name = name;
            this.lastName = lastName;
            this.address = address;
        }

        public Human(String name) {

            this.name = name;
        }

        public Human(String name, String lastName) {

            this.name = name;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, int age) {

            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String name, String lastName, int age, String address) {

            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.address = address;
        }

        public Human(String name, String lastName, int age, String address, boolean sex) {

            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.address = address;
            this.sex = sex;
        }

        public Human(String name, String lastName, int age, String address, boolean sex, String education) {

            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.address = address;
            this.sex = sex;
            this.education = education;
        }
    }
}
