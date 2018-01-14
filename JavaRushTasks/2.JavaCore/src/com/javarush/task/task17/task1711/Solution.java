package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date birth = null;
        Person person = null;
        int cntPerson = (args.length - 1) / 3;
        switch (args[0]){
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1; i <= cntPerson; i++) {
                        try {
                            birth = format.parse(args[3 * i]);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        if (args[3 * i - 1].equals("м")) {
                            person = Person.createMale(args[3 * i - 2], birth);
                        } else person = Person.createFemale(args[3 * i - 2], birth);
                        allPeople.add(person);
                        System.out.println(allPeople.indexOf(person));
                    }
                }
                break;

            case "-u":
                synchronized (allPeople) {
                    for (int i = 1; i <= cntPerson; i++) {
                        try {
                            birth = format.parse(args[4 * i]);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        if (args[4 * i - 1].equals("м")) {
                            person = Person.createMale(args[4 * i - 2], birth);
                        } else person = Person.createFemale(args[4 * i - 2], birth);
                        allPeople.set(Integer.parseInt(args[4 * i - 3]), person);
                    }
                }
                break;

            case "-d":
                synchronized (allPeople) {
                    cntPerson = (args.length - 1);
                    for (int i = 1; i <= cntPerson; i++) {
                        int index = Integer.parseInt(args[1 * i]);
                        person = allPeople.get(index);
                        person.setName(null);
                        person.setBirthDay(null);
                        person.setSex(null);
                        allPeople.set(index, person);
                    }
                }
                break;

            case "-i":
                synchronized (allPeople) {
                    cntPerson = (args.length - 1);
                    for (int i = 1; i <= cntPerson; i++) {
                        person = allPeople.get(Integer.parseInt(args[1 * i]));
                        char sex;
                        Date date = person.getBirthDay();
                        format.applyPattern("dd-MMM-yyyy");
                        if (person.getSex().equals(Sex.MALE)) {
                            sex = 'м';
                        } else sex = 'ж';
                        System.out.println(person.getName() + " " + sex + " " + format.format(date));
                    }
                }
                break;

        }
    }
}
