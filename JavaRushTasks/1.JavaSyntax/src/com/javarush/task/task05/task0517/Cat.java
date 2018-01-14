package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name, color, address;
    int weight;
    int age;

    public Cat(String name){
        this.name = name;
        weight = 10;
        age = 2;
        color = "black";
    }

    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "black";
    }

    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        weight = 10;
        color = "black";
    }

    public Cat(int weight, String color){
        this.weight = weight;
        this.color = color;
        age = 2;
    }

    public Cat(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 2;
    }

    public static void main(String[] args) {

    }
}
