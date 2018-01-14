package com.javarush.task.task22.task2202;

/*
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        //System.out.println(getPartOfString("JavaRush - лучший сервис обучения"));
    }

    public static String getPartOfString(String string) {
        try {
            String result;
            int index = 0;
            for (int i = 0; i < 4; i++) {
                index = string.indexOf(" ", index + 1);
                if (index <= 0) throw new TooShortStringException();
                //System.out.println("index - " + index);
            }
            index = string.indexOf(" ", index + 1);
            if (index == -1) index = string.length();
            result = string.substring(string.indexOf(" ") + 1, index);
            return result;
        } catch (Exception e){
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
