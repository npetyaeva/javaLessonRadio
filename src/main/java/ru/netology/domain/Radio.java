package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Radio {

    private int currentNumberStation;
    private int numberStationMin;
    private int numberStationMax = 10;

    private int currentVolume;
    private int volumeMin;
    private int volumeMax = 100;


    public Radio(int numberStationMax) {
        this.numberStationMax = numberStationMax;
    }

    public void setNextNumberStation() {
        if (currentNumberStation >= numberStationMax - 1) {
            this.currentNumberStation = numberStationMin;
            return;
        }
        this.currentNumberStation += 1;
    }

    public void setPrevNumberStation() {
        if (currentNumberStation <= numberStationMin) {
            this.currentNumberStation = numberStationMax - 1;
            return;
        }
        this.currentNumberStation -= 1;
    }

    public int setNumberStation(int currentNumberStation) {
        if (currentNumberStation < numberStationMin || currentNumberStation > numberStationMax - 1) {
            return this.currentNumberStation;
        }
        this.currentNumberStation = currentNumberStation;
        return(this.currentNumberStation);
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
