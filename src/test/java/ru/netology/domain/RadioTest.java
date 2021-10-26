package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    private final Radio radio = new Radio();

    @Test
    void getCurrentNumberStation() {

        int exprcted = 0;
        int actual = radio.getCurrentNumberStation();
        assertEquals(exprcted, actual);

    }
}