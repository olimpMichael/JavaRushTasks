package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        Cat grandfather = new Cat(name, null, null);

        name = reader.readLine();
        Cat grandmother = new Cat(name, null, null);

        name = reader.readLine();
        Cat father = new Cat(name, null, grandfather);

        name = reader.readLine();
        Cat mother = new Cat(name, grandmother, null);

        name = reader.readLine();
        Cat son = new Cat(name, mother, father);

        name = reader.readLine();
        Cat daughter = new Cat(name, mother, father);

        System.out.println(grandfather);
        System.out.println(grandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(daughter);

    }

    public static class Cat {
        private String name;
        private Cat parent_mum;
        private Cat parent_dad;
        private String stemma;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent_mum, Cat parent_dad) {
            this.name = name;
            this.parent_mum = parent_mum;
            this.parent_dad = parent_dad;
        }

        @Override
        public String toString() {
            if (parent_mum == null & parent_dad == null)
                return "Cat name is " + name + ", no mother, no father";
            else if (parent_mum == null)
                return "Cat name is " + name + ", no mother, father is " + parent_dad.name;
            else if (parent_dad == null)
                return "Cat name is " + name + ", mother is " + parent_mum.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + parent_mum.name + ", father is " + parent_dad.name;
        }
    }

}
