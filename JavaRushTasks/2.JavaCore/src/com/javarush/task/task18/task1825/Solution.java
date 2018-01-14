package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        TreeSet<String> set = new TreeSet<>();

        while (!(str = bufferedReader.readLine()).equals("end")){
            set.add(str);
        }

        String fileName = set.first();

        String fileOutput = fileName.substring(0, fileName.lastIndexOf("part") - 1);


        //System.out.println(fileOutput);

        File file = new File(fileOutput);
        FileOutputStream outputStream = new FileOutputStream(fileOutput);

        byte[] buffer = new byte[1000];
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            fileName = iterator.next();
            FileInputStream inputStream = new FileInputStream(fileName);
            while (inputStream.available() > 0){
                int count = inputStream.read(buffer);
                outputStream.write(buffer, 0, count);
            }
            inputStream.close();
        }
        outputStream.close();
    }
}
