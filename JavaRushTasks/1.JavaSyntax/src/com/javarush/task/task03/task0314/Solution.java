package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int y = 1; y < 11; y++){
            for (int x = 1; x < 11; x++){
                System.out.print(x * y + " ");
            }
            System.out.println();
        }
    }
}
