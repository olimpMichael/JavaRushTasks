package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        String[] strings = s.split(" ");
        String result = "";
        String str;
        for (int i = 0; i < strings.length; i++) {
            String element = strings[i];
            if (!" ".equals(element) && !element.equals("")){
                if (i < strings.length - 1) {
                    str = (element.substring(0, 1)).toUpperCase() + element.substring(1, element.length()) + " ";
                } else str = (element.substring(0, 1)).toUpperCase() + element.substring(1, element.length());
                result = result + str;
            }
        }

        System.out.println(result);
    }
}
