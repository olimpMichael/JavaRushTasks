package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String color;
    String address;

    public void initialize(String name){
        this.name = name;
        age = 1;
        weight = 1;
        color = "blue";
    }

    public void initialize(String name, int weight ,int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "blue";
    }

    public void initialize(String name, int age){
        this.name = name;
        this.age = age;
        weight = 1;
        color = "blue";
    }

    public void initialize(int weight, String color ){
        this.weight = weight;
        this.color = color;
        age = 1;
    }

    public void initialize(int weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 1;
    }

    public static void main(String[] args) {

    }
}
