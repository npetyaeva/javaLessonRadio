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

    public void setPrevNumberStation() {
        if (currentNumberStation == 0) {
            this.currentNumberStation = 9;
            return;
        }
        this.currentNumberStation -= 1;
    }

    public int setNumberStation(int currentNumberStation) {
        if (currentNumberStation < 0 || currentNumberStation > 9) {
            return this.currentNumberStation;
        }
        this.currentNumberStation = currentNumberStation;
        return(this.currentNumberStation);
    }
}
