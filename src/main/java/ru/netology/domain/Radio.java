package ru.netology.domain;

public class Radio {

    private int currentNumberStation;
    private int NumberStationMin = 0;
    private int NumberStationMax = 9;

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public void setNextNumberStation() {
        if (currentNumberStation == NumberStationMax) {
            this.currentNumberStation = NumberStationMin;
            return;
        }
        this.currentNumberStation += 1;
    }

    public void setPrevNumberStation() {
        if (currentNumberStation == NumberStationMin) {
            this.currentNumberStation = NumberStationMax;
            return;
        }
        this.currentNumberStation -= 1;
    }

    public int setNumberStation(int currentNumberStation) {
        if (currentNumberStation < NumberStationMin || currentNumberStation > NumberStationMax) {
            return this.currentNumberStation;
        }
        this.currentNumberStation = currentNumberStation;
        return(this.currentNumberStation);
    }
}
