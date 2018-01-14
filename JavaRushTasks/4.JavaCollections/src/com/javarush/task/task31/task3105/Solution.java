package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, byte[]> zipMap = new HashMap<String, byte[]>();
        String fileName = args[0].substring(args[0].lastIndexOf("\\") + 1);
        Path file = Paths.get(args[0]);

        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(args[1]))) {
            ZipEntry entry;
            while ((entry = zipInputStream.getNextEntry()) != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[8*1024];
                int len;
                while ((len = zipInputStream.read(buffer)) > 0) {
                    byteArrayOutputStream.write(buffer, 0, len);
                }
                zipMap.put(entry.getName(), byteArrayOutputStream.toByteArray());
                zipInputStream.closeEntry();
            }
        }

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(args[1]))) {
            boolean flag = true;
            for (Map.Entry<String, byte[]> mapEntry : zipMap.entrySet()) {
                zipOutputStream.putNextEntry(new ZipEntry(mapEntry.getKey()));
                if (Paths.get(mapEntry.getKey()).getFileName().equals(fileName)) {
                    Files.copy(file.toAbsolutePath(), zipOutputStream);
                    flag = false;
                } else {
                    zipOutputStream.write(mapEntry.getValue());
                }
                zipOutputStream.closeEntry();
            }
            if (flag) {
                zipOutputStream.putNextEntry(new ZipEntry("new\\" + fileName));
                Files.copy(file, zipOutputStream);
                zipOutputStream.closeEntry();
            }
        }
    }
}
