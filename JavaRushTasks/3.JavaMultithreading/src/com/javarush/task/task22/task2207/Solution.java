package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        String str;
        ArrayList<String> list = new ArrayList<String>();

        while ((str = bufferedReader.readLine()) != null){
            for (String word : str.split(" ")) {
                word.trim();
                list.add(word);
            }
        }
        bufferedReader.close();
        boolean[] array = new boolean[list.size()];

        for(int i = 0; i < list.size(); i++){
            StringBuilder sb = new StringBuilder(list.get(i));
            sb.reverse();
            //System.out.println("sb " + sb);
            for (int j = i + 1; j < list.size(); j++){
                //System.out.println("list.get(j) - " + list.get(j) + "; sb - " + sb);
                if (list.get(j).equals(sb.toString().trim()) && !array[j] && !array[i]){
                    array[i] = true;
                    array[j] = true;
                    // System.out.println("equals - " + list.get(j));
                    result.add(new Pair(sb.reverse().toString(), list.get(j)));
                    break;
                }
            }
        }


        /*System.out.println(list);
        System.out.println(result);*/
    }

    public static class Pair {
        String first;
        String second;

        protected Pair() {
        }

        // Добавлено для удобства
        public Pair(String str1, String str2) {
            first = str1;
            second = str2;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                            second == null && first != null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
