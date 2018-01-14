package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();

        FileInputStream inputStream = new FileInputStream(name);
        int cnt = 0;
        int tmp = 0;
        int maxCount = 0;
        HashMap <Integer, Integer> map = new HashMap<>();
        while(inputStream.available() > 0){
            tmp = inputStream.read();
            if (!map.containsKey(tmp)) {
                map.put(tmp, 1);
            } else {
                cnt = map.get(tmp);
                map.put(tmp, ++cnt);
                if (cnt > maxCount) maxCount = cnt;
            }
        }
        bufferedReader.close();
        inputStream.close();

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        Map.Entry<Integer, Integer> pair;
        while (iterator.hasNext()){
            pair = iterator.next();
            tmp = pair.getValue();
            if (tmp == maxCount) System.out.print(pair.getKey() + " ");
        }


    }
}
