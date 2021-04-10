package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldGetAndSetStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldGetAndSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(11);
        int expected = 10;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldSwitchToNextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        radio.switchToNextStation();
        int expected = 4;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.switchToPrevStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(7);
        radio.increaseVolume();
        int expected = 8;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }
}