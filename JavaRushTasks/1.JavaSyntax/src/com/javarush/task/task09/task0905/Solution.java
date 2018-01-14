package com.javarush.task.task09.task0905;

/* 
Там, в синих глубинах стек-трейса…
*/

import java.util.Currency;

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
        //System.out.println(deep);
    }

    public static int getStackTraceDeep() {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        int deep = stackTraceElements.length;
        System.out.println(deep);
        return deep;
    }
}

