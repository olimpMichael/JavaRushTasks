package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Проход по дереву файлов
*/
public class Solution {
    static ArrayList<File> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File resultFile = new File(resultFileAbsolutePath.getParent().toString() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, resultFile);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(resultFile))) {

            File[] fileArray = path.listFiles();
            solution.browseDir(fileArray);
            Collections.sort(list, new Comparator<File>() {
                @Override
                public int compare(File o1, File o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });

            for (File file : list) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                String str;
                while ((str = bufferedReader.readLine()) != null) {
                    bufferedWriter.write(str);
                }
                bufferedWriter.write("\n");
                bufferedReader.close();
            }
            bufferedWriter.close();
        }
    }

    public void browseDir (File[] fileArray) {

        for (File file : fileArray) {
            if (file.isFile() && file.length() > 50) FileUtils.deleteFile(file);
            else if (file.isFile() && file.length() <= 50) list.add(file);
            else if (file.isDirectory()) browseDir(file.listFiles());
            else return;
        }
        return;
    }

}
