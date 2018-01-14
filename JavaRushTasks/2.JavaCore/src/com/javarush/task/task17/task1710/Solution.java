package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        SimpleDateFormat format = new SimpleDateFormat();
        Date birth = null;
        Person person = null;

        if (args.length != 0){
            switch (args[0]){
                case "-c":
                    format.applyPattern("dd/MM/yyyy");
                    try {
                        birth = format.parse(args[3]);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    if (args[2].equals("м")){
                        person = Person.createMale(args[1], birth);
                    } else person = Person.createFemale(args[1], birth);
                    allPeople.add(person);
                    System.out.println(allPeople.indexOf(person));
                    break;

                case "-u":
                    format.applyPattern("dd/MM/yyyy");
                    try {
                        birth = format.parse(args[4]);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    if (args[3].equals("м")){
                        person = Person.createMale(args[2], birth);
                    } else person = Person.createFemale(args[2], birth);
                    allPeople.set(Integer.parseInt(args[1]), person);
                    break;

                case "-d":
                    int index = Integer.parseInt(args[1]);
                    person = allPeople.get(index);
                    person.setName(null);
                    person.setBirthDay(null);
                    person.setSex(null);
                    allPeople.set(index, person);
                    break;

                case "-i":
                    person = allPeople.get(Integer.parseInt(args[1]));
                    char sex;
                    Date date = person.getBirthDay();
                    format.applyPattern("dd-MMM-yyyy");
                    if (person.getSex().equals(Sex.MALE)) {
                        sex = 'м';
                    } else sex = 'ж';
                    System.out.println(person.getName() + " " + sex + " " + format.format(date));
                    break;
            }
        }
    }
}
