package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List <String> list = new ArrayList<>();
        File source = new File(root);
        Queue<File> treeFile = new PriorityQueue<>();
        Collections.addAll(treeFile, source.listFiles());
        while(!treeFile.isEmpty()){
            File file = treeFile.remove();
            if(file.isFile()){
                list.add(file.getAbsolutePath());
            } else Collections.addAll(treeFile, file.listFiles());
        }
        return list;
    }

    public static void main(String[] args) {
        
    }
}
