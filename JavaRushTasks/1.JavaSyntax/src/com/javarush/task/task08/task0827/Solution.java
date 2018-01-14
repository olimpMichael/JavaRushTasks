package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        SimpleDateFormat format = new SimpleDateFormat("MMM d yyyy", Locale.ENGLISH);
        //format.applyPattern("MMM d yyyy", Locale.ENGLISH);
        //format.
        try {
            Date docDate = format.parse(date);
            System.out.println(docDate);
            format = new SimpleDateFormat("D", Locale.ENGLISH);
            int result = Integer.parseInt(format.format(docDate));
            if (result % 2 == 0) return false;
            else return true;
            //System.out.println(format.format(docDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return false;
    }
}
