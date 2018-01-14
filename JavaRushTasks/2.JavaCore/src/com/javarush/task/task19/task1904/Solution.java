package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String str = fileScanner.nextLine();
            String[] data = str.split(" ");
            String firstName = data[1];
            String middleName = data[2];
            String lastName = data[0];

            String s= data[3] + "." + data[4] + "." + data[5];
            SimpleDateFormat format = new SimpleDateFormat();
            format.applyPattern("dd.MM.yyyy");
            Date birthDate = null;
            try {
                birthDate = format.parse(s);
            } catch (ParseException e) {
                e.printStackTrace();
            }

            Person person = new Person(firstName, middleName, lastName, birthDate);

            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
