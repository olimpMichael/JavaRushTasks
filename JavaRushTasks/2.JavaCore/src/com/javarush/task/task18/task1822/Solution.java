package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();


        FileInputStream inputStream = new FileInputStream(file);
        bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String id = args[0];
        String str;
        String tmp;
        while ((str = bufferedReader.readLine()) != null) {
            tmp = str.substring(0, str.indexOf(" "));
            if (tmp.equals(id)) {
                System.out.println(str);
                break;
            }
        }

        bufferedReader.close();
        inputStream.close();

    }
}
