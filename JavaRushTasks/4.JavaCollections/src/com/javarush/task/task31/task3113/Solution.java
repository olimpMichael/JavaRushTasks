package com.javarush.task.task31.task3113;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/* 
Что внутри папки?
*/
public class Solution extends SimpleFileVisitor<Path> {
    static int countDir = 0;
    static int countFile = 0;
    static long size = 0;
    public static void main(String[] args) throws IOException {


        Solution solution = new Solution();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String dir = bufferedReader.readLine();
        bufferedReader.close();
        Path dirPath = Paths.get(dir);


        if (!Files.isDirectory(dirPath)) {
            System.out.println(dir + "  - не папка");
            return;
        }

        Files.walkFileTree(dirPath, solution);
        countDir--;


        /*File dirFile = dirPath.toFile();
        Queue<File> fileList = new PriorityQueue<File>();
        fileList.addAll(Arrays.asList(dirFile.listFiles()));*/



        /*while (!fileList.isEmpty()) {
            File file = fileList.remove();
            if (file.isFile()) {
                countFile++;
                size += file.length();
            }
            else {
                countDir++;
                fileList.addAll(Arrays.asList(file.listFiles()));
            }
        }*/

        System.out.println("Всего папок - " + countDir);
        System.out.println("Всего файлов - " + countFile);
        System.out.println("Общий размер - " + size);
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        countDir++;
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        countFile++;
        size += attrs.size();
        return FileVisitResult.CONTINUE;
    }
}
