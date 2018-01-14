package com.javarush.task.task20.task2026;

/* 
Алгоритмы-прямоугольники
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        int tmp = 0;
        byte[] line = new byte[a.length];
        for (int i = 0; i < a.length; i++) {
            line[i] = a[0][i];
            if (tmp == 0 &&  a[0][i] == 1) {
                count++;
               /* System.out.println("Первый цикл");*/
            }
            tmp = a[0][i];
        }
        //System.out.println(line);
        tmp = 0;
        for (int i = 1; i < a.length; i++){
            for (int j = 0; j <a.length; j++) {
                if(line[j] == 0 && a[i][j] == 1 && tmp == 0) {
                    count++;
                    /*System.out.println("i - " + i + ", j - " + j + ", a[i][j] - " + a[i][j]);
                    System.out.println("Второй цикл");*/
                }
                line[j] = a[i][j]; //сохраняем текущую ячейку в строчный массив
                tmp = a[i][j];

            }
        }
        return count;
    }
}
