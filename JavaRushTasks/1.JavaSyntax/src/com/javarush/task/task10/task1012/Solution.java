package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //ArrayList<Integer> countList = new ArrayList<>();
        int[] countArray = new int[33];
        // напишите тут ваш код
        for (String str : list){
            for(int i = 0; i < str.length(); i++){
                if (alphabet.contains(str.charAt(i))){
                    char ch = str.charAt(i);
                    //System.out.println(ch);
                    int count = countArray[alphabet.indexOf(ch)];
                    count++;
                    countArray[alphabet.indexOf(ch)] = count;
                }

            }
        }

        for (int i = 0; i < alphabet.size(); i++){
            System.out.println(alphabet.get(i) + " " + countArray[i]);
        }
    }

}
