package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(bufferedReader.readLine());
        if (number == 0) System.out.println("ноль");
        else if(number > 0 & number % 2 == 0) System.out.println("положительное четное число");
        else if(number > 0 & number % 2 != 0) System.out.println("положительное нечетное число");
        else if(number < 0 & number % 2 == 0) System.out.println("отрицательное четное число");
        else if(number < 0 & number % 2 != 0) System.out.println("отрицательное нечетное число");
    }
}
