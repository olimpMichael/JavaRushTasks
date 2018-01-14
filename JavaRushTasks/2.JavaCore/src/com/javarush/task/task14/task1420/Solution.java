package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(bufferedReader.readLine());
        int i2 = Integer.parseInt(bufferedReader.readLine());
        if (i1 <= 0 || i2 <= 0) throw new Exception();
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (i1 < i2) {
            list.add(i1);
            list.add(i2);
        } else {
            list.add(i2);
            list.add(i1);
        }
        while (true) {
            int number = list.get(list.size() - 2) % list.get(list.size() - 1);
            //System.out.println(number);
            if (number > 0) list.add(number);
            else break;
        }

        System.out.println(list.get(list.size() - 1));
    }
}
