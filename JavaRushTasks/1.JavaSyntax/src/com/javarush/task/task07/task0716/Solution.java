package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        /*list.add("роза"); //0
        list.add("лоза"); //1 лоза
        list.add("лира"); //2 лира*/

        list.add("роза");
        list.add("рука");
        list.add("ромб");
        list.add("лоза");
        list.add("лира");


        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        int size = list.size();
        for (int i = size - 1; i >= 0 ; i--){
            String str = list.get(i);
            if (str.contains("л") && !str.contains("р")){
                list.add(str);
                //--size;
                //i++;
            } else if (str.contains("р") && !str.contains("л")){
                list.remove(i);
                //i--;
            }
            //i++;
        }
        return list;
    }
}