package com.javarush.task.task31.task3111;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName, partOfContent;
    private int minSize = -1;
    private int maxSize = -1;
    private List<Path> foundFiles = new ArrayList<Path>();

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    public String getPartOfName() {
        return partOfName;
    }

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
    }

    public String getPartOfContent() {
        return partOfContent;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
    }

    public int getMinSize() {
        return minSize;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length

        //Содержит ли имя файла искомое вхождение
        boolean containsName = true;
        if(partOfName!=null && !file.getFileName().toString().contains(partOfName))
            containsName = false;

        //Есть ли в теле файла вхождение требуемой строки
        String contentString = new String(content);
        boolean containsContent = true;
        if(partOfContent!=null && !contentString.contains(partOfContent))
            containsContent = false;

        //Задан ли критерий maxsize
        boolean maxSizeContent = true;
        if(maxSize !=-1 && !(content.length < maxSize))
            maxSizeContent = false;

        //Задан ли критерий minSize
        boolean minSizeContent = true;
        if(minSize !=-1 && !(content.length > minSize))
            minSizeContent = false;

        if(containsName && containsContent && maxSizeContent && minSizeContent)
            foundFiles.add(file);

        return FileVisitResult.CONTINUE;


       // return super.visitFile(file, attrs);
    }
}
