package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {
    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = bufferedReader.readLine();
            switch (str){
                case "helicopter":
                    result = new Helicopter();
                    break;
                case "plane":
                    result = new Plane(Integer.parseInt(bufferedReader.readLine()));
                    break;
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
