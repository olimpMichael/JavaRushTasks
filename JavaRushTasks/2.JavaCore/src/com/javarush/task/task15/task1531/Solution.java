package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        if (n < 0) return "0";
        BigInteger result = BigInteger.valueOf(1);
        int i = 1;
        while (i <= n) {
            result = result.multiply(BigInteger.valueOf(i));
            //System.out.println(result);
            i++;
        }
        return result.toString();
    }
}
