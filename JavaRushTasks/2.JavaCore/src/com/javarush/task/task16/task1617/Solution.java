package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e){
        }
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while(!isInterrupted() && countSeconds >= 0){
                try {
                    if (countSeconds == 0) {
                        System.out.print("Марш!");
                        break;
                    }
                    else System.out.print(countSeconds + " ");

                    countSeconds--;
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                    System.out.print("Прервано!");
                    break;
                }
            }
            //add your code here - добавь код тут
        }
    }
}
