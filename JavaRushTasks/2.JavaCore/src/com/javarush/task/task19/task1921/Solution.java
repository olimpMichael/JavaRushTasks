package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        String str;
        Pattern pattern = Pattern.compile("[[a-zA-Zа-яА-Я_-][\\s]]+");
        while((str=bufferedReader.readLine())!=null){
            Matcher matcher = pattern.matcher(str);
            matcher.find();
            String name = str.substring(0, matcher.end()).trim();
            String date = str.substring(matcher.end(), str.length()).trim();
            SimpleDateFormat format = new SimpleDateFormat();
            format.applyPattern("dd MM yyyy");
            Date birthday = null;
            try {
                birthday = format.parse(date);
            } catch (ParseException e) {
                System.out.println("Неверная дата");
            }
            PEOPLE.add(new Person(name, birthday));
        }
        bufferedReader.close();

    }
}
