package com.javarush.task.task04.task0433;


/* 
Гадание на долларовый счет
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int x = 10, y = 10;
        while(x > 0){
            while(y > 0){
                System.out.print("S");
                y--;
            }
            System.out.println("");
            x--;
            y = 10;
        }

    }
}
