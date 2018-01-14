package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle(){
        x = 10.0;
        y = 10.0;
        radius = 10.0;
    }

    public Circle(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double x, double y){
        this.x = x;
        this.y = y;
        radius = 10.0;
    }

    public Circle(double x){
        this.x = x;
        y = x;
        radius = 10.0;
    }

    public static void main(String[] args) {

    }
}