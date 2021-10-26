package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private final Radio radio = new Radio();

    //getCurrentNumberStation()
    @Test
    void souldGetCurrentNumberStation() {

        int expected = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(expected, actual);

    }

    //setNextNumberStation
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
}