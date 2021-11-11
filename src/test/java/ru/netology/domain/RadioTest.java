package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private Radio radio = new Radio();
    private Radio radio1 = new Radio(50);

    //-----------NumberStation--------------
    //getCurrentNumberStation()
    @Test
    void shouldGetCurrentNumberStation() {
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);

    }

    //setNextNumberStation()
    //---------firstConstructor-----------
    @Test
    void shouldSetNextNumberStation() {
        int expected = 1;
        radio.setNextNumberStation();
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldSetNextNumberStationIfMax() {
        int expected = radio.getNumberStationMin();
        radio.setCurrentNumberStation(radio.getNumberStationMax());
        radio.setNextNumberStation();
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);

    }

    //---------secondConstructor-----------

    @Test
    void shouldSetNextNumberStation1() {
        int expected = 1;
        radio1.setNextNumberStation();
        int actual = radio1.getCurrentNumberStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldSetNextNumberStationIfMax1() {
        int expected = radio1.getNumberStationMin();
        radio1.setCurrentNumberStation(radio1.getNumberStationMax());
        radio1.setNextNumberStation();
        int actual = radio1.getCurrentNumberStation();
        assertEquals(expected, actual);

    }

    //setPrevNumberStation()
    @Test
    void shouldSetPrevNumberStation() {
        int expected = 5;
        radio.setNumberStation(6);
        radio.setPrevNumberStation();
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevNumberStationIfMin() {
        int expected = radio.getNumberStationMax();
        radio.setPrevNumberStation();
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }


    //setNumberStation()
    //---------firstConstructor-----------
    @Test
    void shouldSetNumberStation() {
        int expected = 5;
        int actual = radio.setNumberStation(5);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationBiggerMax() {
        int expected = radio.getCurrentNumberStation();
        int actual = radio.setNumberStation(30);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationMuchLessMin() {
        int expected = radio.getCurrentNumberStation();
        int actual = radio.setNumberStation(-30);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationLessMin() {
        int expected = 0;
        int actual = radio.setNumberStation(radio.getNumberStationMin() - 1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationMin() {
        int expected = 0;
        int actual = radio.setNumberStation(radio.getNumberStationMin());
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationMoreMin() {
        int expected = 1;
        int actual = radio.setNumberStation(radio.getNumberStationMin() + 1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationLessMax() {
        int expected = 9;
        int actual = radio.setNumberStation(radio.getNumberStationMax() - 1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationMax() {
        int expected = 10;
        int actual = radio.setNumberStation(radio.getNumberStationMax());
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationMoreMax() {
        int expected = radio.getCurrentNumberStation();
        int actual = radio.setNumberStation(radio.getNumberStationMax() + 1);
        assertEquals(expected, actual);
    }

    //---------secondConstructor-----------

    @Test
    void shouldSetNumberStationLessMax1() {
        int expected = radio1.getNumberStationMax() - 1;
        int actual = radio1.setNumberStation(radio1.getNumberStationMax() - 1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationMax1() {
        int expected = radio1.getNumberStationMax();
        int actual = radio1.setNumberStation(radio1.getNumberStationMax());
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationMoreMax1() {
        int expected = radio.getCurrentNumberStation();
        int actual = radio.setNumberStation(radio.getNumberStationMax() + 1);
        assertEquals(expected, actual);
    }

    //----------------Volume------------------

    //getCurrentVolume()
    @Test
    void shouldGetCurrentVolume() {
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);

    }

    //increaseVolume()
    @Test
    void shouldIncreaseVolume() {
        int expected = 1;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeBiggerMax() {
        int expected = 100;
        radio.setCurrentVolume(radio.getVolumeMax());
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeLessMax() {
        int expected = 100;
        radio.setCurrentVolume(radio.getVolumeMax() - 1);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMax() {
        int expected = 100;
        radio.setCurrentVolume(radio.getVolumeMax());
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMoreMax() {
        int expected = 100;
        radio.setCurrentVolume(radio.getVolumeMax() + 1);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //decreaseVolume()
    @Test
    void shouldDecreaseVolume() {
        int expected = 5;
        radio.setCurrentVolume(6);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeMoreLessMin() {
        int expected = 0;
        radio.setCurrentVolume(-30);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeLessMin() {
        int expected = 0;
        radio.setCurrentVolume(radio.getVolumeMin() - 1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMin() {
        int expected = 0;
        radio.setCurrentVolume(radio.getVolumeMin());
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMoreMin() {
        int expected = 0;
        radio.setCurrentVolume(radio.getVolumeMin() + 1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}