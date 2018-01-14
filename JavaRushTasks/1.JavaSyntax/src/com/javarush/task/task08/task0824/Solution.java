package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Сын1", 5, true);
        Human child2 = new Human("Сын2", 5, true);
        Human child3 = new Human("Сын3", 5, true);

        ArrayList<Human> listChildren = new ArrayList<Human>();
        listChildren.add(child1);
        listChildren.add(child2);
        listChildren.add(child3);
        Human mam = new Human("Мать", 37, false, listChildren);
        Human dad = new Human("Отец", 35, true, listChildren);

        ArrayList<Human> listMam = new ArrayList<Human>();
        listMam.add(mam);
        Human grandMa1 = new Human("Баба1", 65, false, listMam);
        Human grandPa1 = new Human("Баба2", 67, true, listMam);

        ArrayList<Human> listDad = new ArrayList<Human>();
        listDad.add(dad);
        Human grandMa2 = new Human("Дед", 65, false, listDad);
        Human grandPa2 = new Human("Дед2", 67, true, listDad);

        System.out.println(grandPa1);
        System.out.println(grandMa1);
        System.out.println(grandPa2);
        System.out.println(grandMa2);
        System.out.println(dad);
        System.out.println(mam);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        int age;
        boolean sex;
        ArrayList<Human> children;

        public Human(String name, int age, boolean sex, ArrayList<Human> children){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.children = children;
        }

        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
            children = new ArrayList<Human>();
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
