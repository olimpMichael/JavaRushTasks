package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String years = bufferedReader.readLine();
        String name = bufferedReader.readLine();
        //int years = Integer.parseInt(sYears);

        System.out.println(name + " захватит мир через " +  years + " лет. Му-ха-ха!");
    }
}
