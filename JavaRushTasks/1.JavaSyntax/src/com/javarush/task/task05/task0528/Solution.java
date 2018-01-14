package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //Calendar calendar = Calendar.getInstance();
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("d M y");
        System.out.println(dateFormat.format(today));

    }
}
