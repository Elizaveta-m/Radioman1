package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldGetAndSetStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldGetAndSetVolume() {
        Radio radio = new Radio();
        radio.setVolume(5);
        int expected = 5;
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
    public void shouldSwitchToNextStationIfLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.switchToNextStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToNextStationOverLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(20);
        radio.switchToNextStation();
        int expected = 1;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.switchToPrevStation();
        int expected = 5;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToPrevStationIfLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.switchToPrevStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToPrevStationUnderLimit() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-5);
        radio.switchToPrevStation();
        int expected = 8;
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
    public void shouldIncreaseVolumeOverLimit() {
        Radio radio = new Radio();
        radio.setVolume(20);
        radio.increaseVolume();
        int expected = 10;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(4);
        radio.decreaseVolume();
        int expected = 3;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolumeIfLimit() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolumeUnderLimit() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }
}