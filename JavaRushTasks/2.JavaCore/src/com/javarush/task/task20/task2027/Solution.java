package com.javarush.task.task20.task2027;

import java.util.ArrayList;
import java.util.List;

/* 
Кроссворд
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };

       detectAllWords(crossword, "home", "same");
        //System.out.println(detectAllWords(crossword, "home", "same"));
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */

       // System.out.println(detectAllWords(crossword, "same"));
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        ArrayList<Word> list = new ArrayList<Word>();
        browse:
        for(String word : words){
            boolean founded = false;
            int startX = -1;
            int startY = -1;
            int endX = -1;
            int endY = -1;
            for(int x = 0; x < crossword.length; x++){
                for(int y = 0; y < crossword[x].length; y++){
                    //System.out.print((char)crossword[x][y] + " ");
                    if ((char)crossword[x][y] == word.charAt(0)){
                        //System.out.println((char)crossword[x][y]);
                        startX = y;
                        startY = x;
                        int tmpX = x;
                        int tmpY = y;
                        int indexWord = 0;

                        // поиск влево
                        while (++indexWord < word.length() && tmpY != 0){
                            tmpY--;
                            if ((char) crossword[tmpX][tmpY] != word.charAt(indexWord))
                                break;
                            else if(indexWord == word.length() - 1){
                                endY = tmpX;
                                endX = tmpY;
                                founded = true;
                            }
                        }

                        if (founded){
                            //System.out.println("founded");
                            Word foundWord = new Word(word);
                            foundWord.setStartPoint(startX, startY);
                            foundWord.setEndPoint(endX, endY);
                            list.add(foundWord);
                            continue browse;
                        }

                        tmpX = x;
                        tmpY = y;
                        indexWord = 0;
                        // поиск вправо
                        while (++indexWord < word.length() && tmpY != crossword[x].length - 1){
                            tmpY++;
                            if ((char) crossword[tmpX][tmpY] != word.charAt(indexWord))
                                break;
                            else if(indexWord == word.length() - 1){
                                endY = tmpX;
                                endX = tmpY;
                                founded = true;
                            }
                        }

                        if (founded){
                            Word foundWord = new Word(word);
                            foundWord.setStartPoint(startX, startY);
                            foundWord.setEndPoint(endX, endY);
                            list.add(foundWord);
                            continue browse;
                        }

                        tmpX = x;
                        tmpY = y;
                        indexWord = 0;
                        // поиск вверх
                        while (++indexWord < word.length() && tmpX != 0){
                            tmpX--;
                            if ((char) crossword[tmpX][tmpY] != word.charAt(indexWord))
                                break;
                            else if(indexWord == word.length() - 1){
                                endY = tmpX;
                                endX = tmpY;
                                founded = true;
                            }
                        }

                        if (founded){
                            Word foundWord = new Word(word);
                            foundWord.setStartPoint(startX, startY);
                            foundWord.setEndPoint(endX, endY);
                            list.add(foundWord);
                            continue browse;
                        }

                        tmpX = x;
                        tmpY = y;
                        indexWord = 0;
                        // поиск вниз
                        while (++indexWord < word.length() && tmpX != crossword.length - 1){
                            tmpX++;
                            if ((char) crossword[tmpX][tmpY] != word.charAt(indexWord))
                                break;
                            else if(indexWord == word.length() - 1){
                                endY = tmpX;
                                endX = tmpY;
                                founded = true;
                            }
                        }

                        if (founded){
                            Word foundWord = new Word(word);
                            foundWord.setStartPoint(startX, startY);
                            foundWord.setEndPoint(endX, endY);
                            list.add(foundWord);
                            continue browse;
                        }

                        //!!!!!!!!!!! Поиск по диагонали !!!!!!!!!!!

                        tmpX = x;
                        tmpY = y;
                        indexWord = 0;
                        // поиск влево вверх
                        while (++indexWord < word.length()
                                && tmpX != 0
                                && tmpY != 0){
                            tmpX--;
                            tmpY--;
                            if ((char) crossword[tmpX][tmpY] != word.charAt(indexWord))
                                break;
                            else if(indexWord == word.length() - 1){
                                endY = tmpX;
                                endX = tmpY;
                                founded = true;
                            }
                        }

                        if (founded){
                            Word foundWord = new Word(word);
                            foundWord.setStartPoint(startX, startY);
                            foundWord.setEndPoint(endX, endY);
                            list.add(foundWord);
                            continue browse;
                        }

                        tmpX = x;
                        tmpY = y;
                        indexWord = 0;
                        // поиск вправо вниз
                        while (++indexWord < word.length()
                                && tmpX != crossword.length - 1
                                && tmpY != crossword[x].length - 1){
                            tmpX++;
                            tmpY++;
                            if ((char) crossword[tmpX][tmpY] != word.charAt(indexWord))
                                break;
                            else if(indexWord == word.length() - 1){
                                endY = tmpX;
                                endX = tmpY;
                                founded = true;
                            }
                        }

                        if (founded){
                            Word foundWord = new Word(word);
                            foundWord.setStartPoint(startX, startY);
                            foundWord.setEndPoint(endX, endY);
                            list.add(foundWord);
                            continue browse;
                        }

                        tmpX = x;
                        tmpY = y;
                        indexWord = 0;
                        // поиск вправо вверх
                        while (++indexWord < word.length()
                                && tmpX != 0
                                && tmpY != crossword[x].length - 1){
                            tmpX--;
                            tmpY++;
                            if ((char) crossword[tmpX][tmpY] != word.charAt(indexWord))
                                break;
                            else if(indexWord == word.length() - 1){
                                endY = tmpX;
                                endX = tmpY;
                                founded = true;
                            }
                        }

                        if (founded){
                            Word foundWord = new Word(word);
                            foundWord.setStartPoint(startX, startY);
                            foundWord.setEndPoint(endX, endY);
                            list.add(foundWord);
                            continue browse;
                        }

                        tmpX = x;
                        tmpY = y;
                        indexWord = 0;
                        // поиск влево вниз
                        while (++indexWord < word.length()
                                && tmpX != crossword.length - 1
                                && tmpY != 0){
                            tmpX++;
                            tmpY--;
                            if ((char) crossword[tmpX][tmpY] != word.charAt(indexWord))
                                break;
                            else if(indexWord == word.length() - 1){
                                endY = tmpX;
                                endX = tmpY;
                                founded = true;
                            }
                        }

                        if (founded){
                            Word foundWord = new Word(word);
                            foundWord.setStartPoint(startX, startY);
                            foundWord.setEndPoint(endX, endY);
                            list.add(foundWord);
                            continue browse;
                        }

                    }
                }
            }
        }

        return list;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
