package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        float minutes = Float.parseFloat(str);
        float ostatok = minutes % 5;

        if (ostatok >= 4 & ostatok < 5) System.out.println("красный");
        else if (ostatok >= 3 & ostatok < 4) System.out.println("жёлтый");
        else System.out.println("зелёный");
    }
}