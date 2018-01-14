package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = bufferedReader.readLine();

        //SimpleDateFormat formatInput = new SimpleDateFormat("MM/DD/yyyy", Locale.ENGLISH);
        //Date date = formatInput.parse(str);
        Date date = new Date(str);
        SimpleDateFormat formatOutput = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        String result = formatOutput.format(date).toUpperCase();
        System.out.println(result);
    }
}
