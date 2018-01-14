package com.javarush.task.task18.task1823;

import java.awt.event.InputEvent;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        while (!(fileName = bufferedReader.readLine()).equals("exit")){
            new ReadThread(fileName).start();
        }
    }

    public static class ReadThread extends Thread {
        String filename;
       // FileInputStream inputStream;
        public ReadThread(String fileName) throws IOException {
            //implement constructor body
            this.filename = fileName;
            //inputStream = new FileInputStream(fileName);
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            int tmp;
            int count;
            int maxCount = 0;
            int maxByte = 0;
            FileInputStream inputStream;
            try {
                inputStream = new FileInputStream(filename);
                HashMap<Integer, Integer> map = new HashMap<>();
                while (inputStream.available() > 0) {
                    tmp = inputStream.read();
                    if (!map.containsKey(tmp)) {
                        map.put(tmp, 1);
                        if (maxCount == 0) {
                            maxCount = 1;
                            maxByte = tmp;
                        }
                    } else {
                        count = map.get(tmp);
                        count++;
                        map.put(tmp, count);
                        if (count > maxCount) {
                            maxCount = count;
                            maxByte = tmp;
                        }
                    }
                }
                resultMap.put(filename, maxByte);
                inputStream.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
