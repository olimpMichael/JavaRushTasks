package com.javarush.task.task12.task1209;

/* 
Три метода и минимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    //Напишите тут ваши методы
    public static int min(int i1, int i2){
        if (i1 < i2) return i1;
        else return i2;
    }

    public static long min(long l1, long l2){
        if (l1 < l2) return l1;
        else return l2;
    }

    public static double min(double d1, double d2){
        if (d1 < d2) return d1;
        else return d2;
    }
}
