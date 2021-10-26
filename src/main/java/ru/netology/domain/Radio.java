package ru.netology.domain;

public class Radio {

    private int currentNumberStation;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setNextNumberStation() {
        if (currentNumberStation == 9) {
            this.currentNumberStation = 0;
            return;
        }
        this.currentNumberStation += 1;
    }

}
