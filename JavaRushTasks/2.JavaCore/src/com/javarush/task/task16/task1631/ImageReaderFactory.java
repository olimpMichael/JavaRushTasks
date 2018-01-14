package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes type) throws IllegalArgumentException{
        ImageReader reader = null;
        try {
            switch (type) {
                case JPG:
                    reader = new JpgReader();
                    break;
                case PNG:
                    reader = new PngReader();
                    break;
                case BMP:
                    reader = new BmpReader();
                    break;
            }
        } catch (Exception e){
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return reader;
    }
}
