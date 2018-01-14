package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleOut = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();
        String str = outputStream.toString();
        int result = 0;

        Pattern pattern1 = Pattern.compile("[+*-]");
        Pattern pattern2 = Pattern.compile("[=]");
        Matcher matcher = pattern1.matcher(str);
        matcher.find();
        int indexOperator = matcher.start();

        matcher = pattern2.matcher(str);
        matcher.find();
        int indexEquilly = matcher.start();




        char operator = str.charAt(indexOperator);
        if (operator == '+'){
                result = Integer.parseInt(str.substring(0, indexOperator).trim()) +
                        Integer.parseInt(str.substring(indexOperator + 1, indexEquilly).trim());
        } else if(operator == '-') {
            result = Integer.parseInt(str.substring(0, indexOperator).trim()) -
                    Integer.parseInt(str.substring(indexOperator + 1, indexEquilly).trim());
        } else {
            result = Integer.parseInt(str.substring(0, indexOperator).trim()) *
                    Integer.parseInt(str.substring(indexOperator + 1, indexEquilly).trim());
        }



        System.setOut(consoleOut);
        /*System.out.println("indexOperator " + indexOperator);
        System.out.println("indexEquilly " + indexEquilly);
        System.out.println("operator" + operator);*/
        System.out.println(str + result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

