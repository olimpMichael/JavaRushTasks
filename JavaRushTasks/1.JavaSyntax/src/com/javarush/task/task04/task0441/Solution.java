package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int tmp = 0;

        if(num1 > num2){
            tmp = num2;
            num2 = num1;
            num1 = tmp;
        }

        if(num2 > num3){
            tmp = num3;
            num3 = num2;
            num2 = tmp;
        }

        if(num1 > num2){
            tmp = num2;
            num2 = num1;
            num1 = tmp;
        }


        System.out.println(num2);



    }
}
