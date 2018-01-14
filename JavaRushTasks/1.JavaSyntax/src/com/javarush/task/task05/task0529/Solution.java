package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();
        int result = 0;
        String flag = "сумма";
        while(!str.equals(flag)){
            int i = Integer.parseInt(str);
            result += i;
            str = bufferedReader.readLine();
           // System.out.println(str);
        }
        System.out.println(result);
    }
}
