package ru.netology.domain;

public class Radio {

    private int currentNumberStation;
    private int NumberStationMin;
    private int NumberStationMax = 9;

    private int currentVolume;
    private int volumeMin;
    private int volumeMax = 10;

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

    public int getCurrentVolume() { return currentVolume; }

    public void increaseVolume() {
        if (currentVolume < volumeMax) {
            currentVolume = currentVolume + 1;
        }
    }
}
