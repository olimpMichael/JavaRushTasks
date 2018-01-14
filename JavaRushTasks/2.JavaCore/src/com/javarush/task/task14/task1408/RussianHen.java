package com.javarush.task.task14.task1408;

import com.javarush.task.task14.task1408.Hen;

public class RussianHen extends Hen {
    int getCountOfEggsPerMonth() {
        return 10;
    }

    String getDescription(){
        return (super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу "
                + this.getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
