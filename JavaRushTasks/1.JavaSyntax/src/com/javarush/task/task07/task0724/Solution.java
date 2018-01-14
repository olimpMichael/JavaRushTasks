package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        ArrayList<Human> list = new ArrayList<>();
        list.add(new Human("Аня", false, 19));
        list.add(new Human("Аня", false, 17));
        list.add(new Human("Аня", true, 18));
        list.add(new Human("Аня", true, 10));

        list.add(new Human("Аня", true, 21, list.get(0), list.get(2)));
        list.add(new Human("Аня", true, 20, list.get(1), list.get(3)));

        list.add(new Human("Аня", true, 1, list.get(4), list.get(5)));
        list.add(new Human("Аня", true, 2, list.get(4), list.get(5)));
        list.add(new Human("Аня", true, 3, list.get(4), list.get(5)));

        for (Human human : list){
            System.out.println(human);
        }

    }

    public static class Human {
        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, boolean sex, int age, Human father, Human mother){
            this(name, sex, age);
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















