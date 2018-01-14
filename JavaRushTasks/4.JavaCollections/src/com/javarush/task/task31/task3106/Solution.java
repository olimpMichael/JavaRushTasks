package com.javarush.task.task31.task3106;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) {
        File file = new File(args[0]);
        TreeSet<String> set = new TreeSet<>();
        for (int i = 1; i < args.length; i++){
            set.add(args[i]);
        }

        ArrayList<FileInputStream> listInput = new ArrayList<>();
        for(String s : set){
            try {
                listInput.add(new FileInputStream(s));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


        try (ZipInputStream is = new ZipInputStream(new SequenceInputStream(Collections.enumeration(listInput)));
                OutputStream os = new BufferedOutputStream(new FileOutputStream(file))){
            for(ZipEntry entry = null; (entry = is.getNextEntry()) != null; ) {
                final int bufferSize = 1024;
                byte[] buffer = new byte[bufferSize];
                for(int readBytes = -1; (readBytes = is.read(buffer, 0, bufferSize)) > -1; ) {
                    os.write(buffer, 0, readBytes);
                }
                os.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
