package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        int number = scanner.nextInt();
        while (number!=-1){
            result += number;
            number = scanner.nextInt();
        }
        result += number;
        System.out.println(result);

    }
}
