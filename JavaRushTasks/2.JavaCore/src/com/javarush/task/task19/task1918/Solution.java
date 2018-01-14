package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        bufferedReader = new BufferedReader(new FileReader(fileName));
        String startTag = "<" + args[0];
        String endTag = "</" + args[0] + ">";
        Pattern pattern = Pattern.compile("<" + args[0] + "?[[[\b][\\s]][^>]]+>|</" + args[0] + ">");


        StringBuilder sb = new StringBuilder();

        int start;
        while (bufferedReader.ready()){
            sb.append(bufferedReader.readLine());
        }
        bufferedReader.close();
        String source = sb.toString();

        ArrayList<Integer> listStart = new ArrayList<Integer>();
        ArrayList<Integer> listEnd = new ArrayList<Integer>();


        Matcher matcher = pattern.matcher(source);
        while(matcher.find()){
            if(matcher.group().equals(endTag)){ //Если тег закрытия
                listEnd.add(matcher.end());
            } else{
                listStart.add(matcher.start()); //Если тег открытия
            }
        }

        System.out.println("listStart " + listStart);
        System.out.println("listEnd " + listEnd);

        if (listEnd.size() == listEnd.size() && listStart.size() > 0){
            while(listStart.size()!=0){
                System.out.println(source.substring(listStart.get(0), listEnd.get(0)));
                listStart.remove(0);
                listEnd.remove(0);
            }
        }
        //System.out.println("The End");
    }
}
