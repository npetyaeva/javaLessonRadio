package ru.netology.domain;

public class Radio {

    private int currentNumberStation;
    private int numberStationMin;
    private int numberStationMax = 10;

    private int currentVolume;
    private int volumeMin;
    private int volumeMax = 100;

    public Radio() {
    }

    public Radio(int numberStationMax) {
        this.numberStationMax = numberStationMax;
    }

    public int getCurrentNumberStation() {
        return currentNumberStation;
    }

    public int getNumberStationMin() { return numberStationMin; }

    public int getNumberStationMax() { return numberStationMax; }

    public void setCurrentNumberStation(int currentNumberStation) {
        this.currentNumberStation = currentNumberStation;
    }

    public void setNextNumberStation() {
        if (currentNumberStation >= numberStationMax) {
            this.currentNumberStation = numberStationMin;
            return;
        }
        this.currentNumberStation += 1;
    }

    public void setPrevNumberStation() {
        if (currentNumberStation <= numberStationMin) {
            this.currentNumberStation = numberStationMax;
            return;
        }
        this.currentNumberStation -= 1;
    }

    public int setNumberStation(int currentNumberStation) {
        if (currentNumberStation < numberStationMin || currentNumberStation > numberStationMax) {
            return this.currentNumberStation;
        }
        this.currentNumberStation = currentNumberStation;
        return(this.currentNumberStation);
    }

    public int getCurrentVolume() { return currentVolume; }

    public int getVolumeMin() { return volumeMin; }

    public int getVolumeMax() { return volumeMax; }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < volumeMax) {
            currentVolume += 1;
        } else {
            currentVolume = volumeMax;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > volumeMin) {
            currentVolume -= 1;
        } else {
            currentVolume = volumeMin;
        }
    }
}
