package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;
    private List<Horse> horses;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run(){
        for (int i = 1; i <= 100; i++){
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move(){
        for (Horse horse : getHorses()) {
            horse.move();
        }
    }

    public void print(){
        for (Horse horse : getHorses()) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
        double maxDistance = 0;
        Horse winner = null;
        for (Horse horse: getHorses()) {
            if (horse.getDistance() > maxDistance){
                maxDistance = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().name + "!");
    }

    public static void main(String[] args) throws InterruptedException{
        ArrayList<Horse> horses = new ArrayList<Horse>();
        Horse firstHorse = new Horse("Buran", 3, 0);
        Horse secondHorse = new Horse("Beliy", 3, 0);
        Horse thirdHorse = new Horse("Cherniy", 3, 0);
        horses.add(firstHorse);
        horses.add(secondHorse);
        horses.add(thirdHorse);
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }
}
