package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static{
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(Statics.FILE_NAME)));
            String str;
            while((str = bufferedReader.readLine()) != null){
                lines.add(str);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
