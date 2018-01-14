package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader fileReader1 = new BufferedReader(new FileReader(file1));
        BufferedReader fileReader2 = new BufferedReader(new FileReader(file2));

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        while(fileReader1.ready()){
            list1.add(fileReader1.readLine());
        }

        while(fileReader2.ready()){
            list2.add(fileReader2.readLine());
        }

        Iterator iterator;

        for (int i = 0; i < list1.size(); i++){
            String str1 = list1.get(i);
            iterator = list2.iterator();

            if (iterator.hasNext()){ //Строки эквивалентны
                String str2 = (String) iterator.next();
                if (str1.equals(str2)){
                    lines.add(new LineItem(Type.SAME, str1));
                    list2.remove(str2);
                    continue;

                    //Строки не эквивалентны
                } else if(iterator.hasNext()){
                    if (str1.equals((String) iterator.next())) {
                        lines.add(new LineItem(Type.ADDED, str2));
                        list2.remove(str2);
                        i--;
                        continue;

                    } else {
                        lines.add(new LineItem(Type.REMOVED, str1));
                        continue;
                    }
                } else {
                    lines.add(new LineItem(Type.REMOVED, str1));
                    continue;
                }
            } else {
                lines.add(new LineItem(Type.REMOVED,str1));
            }
        }

        iterator = list2.iterator();
        if (iterator.hasNext()){
            String str2 = (String) iterator.next();
            lines.add(new LineItem(Type.ADDED, str2));
            list2.remove(str2);
        }

        fileReader1.close();
        fileReader2.close();

//        System.out.println(lines);
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            String result = type + " " + line ;
            return result;
        }
    }


}
