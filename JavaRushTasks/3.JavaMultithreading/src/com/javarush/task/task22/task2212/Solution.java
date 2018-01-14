package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null || telNumber == "") return false;

        boolean result = telNumber.matches("^\\+{1}[0-9]{12}")
                || telNumber.matches("^\\+\\d{2}\\(\\d{3}\\)\\d{7}") /* +**(***)******* */
                || telNumber.matches("^\\+\\d{8}-\\d{2}-\\d{2}") /* +********-** */
                || telNumber.matches("^\\d{6}-\\d{4}"); /* ******-**** */

        return result;
    }

    public static void main(String[] args) {
        System.out.println(checkTelNumber("+380501234567"));
    }
}
