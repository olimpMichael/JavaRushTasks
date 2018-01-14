package com.javarush.task.task17.task1721;

import javax.swing.text.html.HTMLDocument;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        Solution solution = new Solution();
        File firstFile;
        File secondFile;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String firstName = bufferedReader.readLine();
            String secondName = bufferedReader.readLine();
            firstFile = new File (firstName);
            secondFile = new File (secondName);
            bufferedReader.close();

            bufferedReader = new BufferedReader(new FileReader(firstFile));
            String line;
            while((line = bufferedReader.readLine()) != null){
                allLines.add(line);
            }
            bufferedReader.close();

            bufferedReader = new BufferedReader(new FileReader(secondFile));
            while((line = bufferedReader.readLine()) != null){
                forRemoveLines.add(line);
            }
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }
    }

    public void joinData () throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
