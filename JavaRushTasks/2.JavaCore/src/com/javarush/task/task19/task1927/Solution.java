package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleOutput = System.out;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        StringBuilder sb = new StringBuilder();
        sb.append(outputStream.toString());
        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(sb);
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(matcher.find()){
            count++;
            if (count ==2){
                list.add(matcher.start() + 1);
                count = 0;
            }
        }
        System.setOut(consoleOutput);

        for(int i = list.size()-1; i >= 0; i--){
            sb.insert(list.get(i), "JavaRush - курсы Java онлайн\n");
        }
        System.out.println(sb.toString());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
