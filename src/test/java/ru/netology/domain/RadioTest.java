package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private final Radio radio = new Radio();

    //-----------NumberStation--------------

    //getCurrentNumberStation()
    @Test
    void shouldGetCurrentNumberStation() {
        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);

    }

    //setNextNumberStation()
    @Test
    void shouldSetNextNumberStation() {
        int expected = 1;
        radio.setNextNumberStation();
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);

    }

    @Test
    void shouldSetNextNumberStationIfMax() {
        int expected = 0;
        for (int i = 0; i <= 9; i++) {
            radio.setNextNumberStation();
        }
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);

    }

    //setPrevNumberStation()
    @Test
    void shouldSetPrevNumberStation() {
        int expected = 5;
        for (int i = 5; i > 0; i--) {
            radio.setPrevNumberStation();
        }
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetPrevNumberStationIfMin() {
        int expected = 9;
        radio.setPrevNumberStation();
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);
    }


    //setNumberStation()
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
        int expected = radio.getCurrentNumberStation();
        int actual = radio.setNumberStation(-1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationMin() {
        int expected = 0;
        int actual = radio.setNumberStation(0);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationMoreMin() {
        int expected = 1;
        int actual = radio.setNumberStation(1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationLessMax() {
        int expected = 8;
        int actual = radio.setNumberStation(8);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationMax() {
        int expected = 9;
        int actual = radio.setNumberStation(9);
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberStationMoreMax() {
        int expected = radio.getCurrentNumberStation();
        int actual = radio.setNumberStation(10);
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
        int expected = 10;
        for (int i = 0; i <= 30; i++) {
            radio.increaseVolume();
        }
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeLessMax() {
        int expected = 10;
        for (int i = 0; i <= 9; i++) {
            radio.increaseVolume();
        }
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMax() {
        int expected = 10;
        for (int i = 0; i <= 10; i++) {
            radio.increaseVolume();
        }
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMoreMax() {
        int expected = 10;
        for (int i = 0; i <= 11; i++) {
            radio.increaseVolume();
        }
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    //decreaseVolume()
    @Test
    void shouldDecreaseVolume() {
        int expected = 5;
        for (int i = 0; i < 5; i++) {
            radio.increaseVolume();
        }
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeMoreLessMin() {
        int expected = 0;
        for (int i = 0; i >= -30; i--) {
            radio.decreaseVolume();
        }
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeLessMin() {
        int expected = 0;
        for (int i = 0; i >= -1; i--) {
            radio.decreaseVolume();
        }
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMin() {
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMoreMin() {
        int expected = 0;
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}