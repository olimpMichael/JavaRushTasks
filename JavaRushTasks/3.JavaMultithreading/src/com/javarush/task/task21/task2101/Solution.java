package com.javarush.task.task21.task2101;

/* 
Определяем адрес сети
*/
public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] result = new byte[]{(byte) (ip[0] & mask[0]), (byte) (ip[1] & mask[1]),
                (byte) (ip[2] & mask[2]), (byte) (ip[3] & mask[3])};
        return  result;
    }

    public static void print(byte[] bytes) {
        /*System.out.println(Integer.toBinaryString (bytes[0]) + " " + Integer.toBinaryString (bytes[1]) + " " +
                Integer.toBinaryString (bytes[2]) + " " + Integer.toBinaryString (bytes[3]));*/
        String tmp = String.format("%8s",
                Integer.toBinaryString(256 + bytes[0])).replace(' ', '0');
        String result0 = tmp.substring(tmp.length() - 8);
        String tmp1 = String.format("%8s",
                Integer.toBinaryString(256 + bytes[1])).replace(' ', '0');
        String result1 = tmp1.substring(tmp1.length() - 8);
        String tmp2 = String.format("%8s",
                Integer.toBinaryString(256 + bytes[2])).replace(' ', '0');
        String result2 = tmp2.substring(tmp2.length() - 8);
        String tmp3 = String.format("%8s",
                Integer.toBinaryString(256 + bytes[3])).replace(' ', '0');
        String result3 = tmp3.substring(tmp3.length() - 8);

        System.out.println(result0 + " " + result1 + " " + result2 + " " + result3);
    }
}
