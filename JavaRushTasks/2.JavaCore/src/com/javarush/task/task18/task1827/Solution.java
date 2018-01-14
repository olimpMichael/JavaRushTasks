package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static final int OPERATOR_INDEX = 0;
    public static final int PRODUCT_NAME = 1;
    public static final int PRICE = 2;
    public static final int QUANTITY = 3;

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();

        if (args[OPERATOR_INDEX].equals("-c")){
            bufferedReader = new BufferedReader(new FileReader(fileName));
            ArrayList<String> buffer = new ArrayList<String>();
            String str;
            int max_id = 0;

            while ((str = bufferedReader.readLine()) != null){
                buffer.add(str);
                int tmp = Integer.parseInt(str.substring(0, 8).trim());
                if (tmp > max_id) max_id = tmp;
               // System.out.println(str);
            }
            str = buffer.get(buffer.size() - 1);
            //System.out.println("str after while " + str);
            bufferedReader.close();

            //int index = Integer.parseInt(str.substring(0, 8).trim());
            int index = max_id++;
            BufferedWriter output = new BufferedWriter(new FileWriter(fileName));
            for (String s : buffer) {
                output.write(s);
            }

            StringBuilder id = new StringBuilder();
            id.append(index);
            while (id.length() < 8){
                id.append(" ");
            }

            StringBuilder product = new StringBuilder();
            product.append(args[PRODUCT_NAME]);
            while (product.length() < 30){
                product.append(" ");
            }

            StringBuilder price = new StringBuilder();
            price.append(args[PRICE]);
            while (price.length() < 8){
                price.append(" ");
            }

            StringBuilder quantity = new StringBuilder();
            quantity.append(args[QUANTITY]);
            while (quantity.length() < 4){
                quantity.append(" ");
            }

            String lastString = String.format(id + product.toString() + price.toString() + quantity.toString());
            output.write(lastString);
            output.close();
        }
    }
}
