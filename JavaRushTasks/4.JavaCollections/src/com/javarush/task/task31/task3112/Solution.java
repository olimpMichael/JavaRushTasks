package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://www.amigo.com/ship/secretPassword.txt",
                Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        // implement this method
        String[] parseArray = urlString.split("/");
        String fileName = parseArray[parseArray.length - 1];
        URL url = new URL(urlString);
        Path tempFile = Files.createTempFile("D:/temp/temp-",".tmp");
        InputStream inputStream = url.openStream();
        Files.copy(inputStream, tempFile);
        Path result = Files.move(tempFile, Paths.get(downloadDirectory.toString() + "/" +fileName));
        inputStream.close();
        return result;

    }
}
