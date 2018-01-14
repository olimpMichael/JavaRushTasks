package com.javarush.task.task05.task0532;

import java.io.*;

import static java.lang.Integer.MIN_VALUE;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        int result = MIN_VALUE;
        int tmp;


        //напишите тут ваш код
        for (int i=0; i<maximum; i++){
            tmp = Integer.parseInt(reader.readLine());
            /*if (i==0){
                result = tmp;
            }*/
            //tmp = Integer.parseInt(reader.readLine());
            if (result < tmp) result = tmp;

        }
        maximum = result;

        System.out.println(maximum);
    }
}
