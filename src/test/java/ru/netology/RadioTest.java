package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void shouldGetAndSetStation() {
        radio.setCurrentRadioStation(8);
        int expected = 8;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldGetAndSetLastStation() {
        radio.setLastRadioStation(11);
        radio.setCurrentRadioStation(12);
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldGetAndSetVolume() {
        radio.setVolume(5);
        int expected = 5;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldSwitchToNextStation() {
        radio.setCurrentRadioStation(3);
        radio.switchToNextStation();
        int expected = 4;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToNextStationIfLimit() {
        radio.setCurrentRadioStation(10);
        radio.switchToNextStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetLastAndSwitchToNextStationIfLimit() {
        radio.setLastRadioStation(15);
        radio.setCurrentRadioStation(15);
        radio.switchToNextStation();
        int expected = 0;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToNextStationOverLimit() {
        radio.setCurrentRadioStation(20);
        radio.switchToNextStation();
        int expected = 1;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToPrevStation() {
        radio.setCurrentRadioStation(6);
        radio.switchToPrevStation();
        int expected = 5;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToPrevStationIfLimit() {
        radio.setCurrentRadioStation(0);
        radio.switchToPrevStation();
        int expected = 10;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSwitchToPrevStationUnderLimit() {
        radio.setCurrentRadioStation(-5);
        radio.switchToPrevStation();
        int expected = 9;
        assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        radio.setVolume(7);
        radio.increaseVolume();
        int expected = 8;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldIncreaseVolumeOverLimit() {
        radio.setVolume(101);
        radio.increaseVolume();
        int expected = 100;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        radio.setVolume(4);
        radio.decreaseVolume();
        int expected = 3;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolumeIfLimit() {
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }

    @Test
    public void shouldDecreaseVolumeUnderLimit() {
        radio.setVolume(-1);
        radio.decreaseVolume();
        int expected = 0;
        assertEquals(expected, radio.getVolume());
    }
}