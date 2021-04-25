package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int firstRadioStation = 0;
    private int lastRadioStation = 10;
    private int volume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int lastRadioStation) {
        this.lastRadioStation = lastRadioStation;
    }

    public Radio() {
    }

    public int getFirstRadioStation() {
        return firstRadioStation;
    }

    public void setFirstRadioStation(int firstRadioStation) {
        this.firstRadioStation = firstRadioStation;
    }

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public void setLastRadioStation(int lastRadioStation) {
        this.lastRadioStation = lastRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > lastRadioStation) {
            this.currentRadioStation = firstRadioStation;
            return;
        }
        if (currentRadioStation < firstRadioStation) {
            this.currentRadioStation = lastRadioStation;
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void switchToNextStation() {
        if (currentRadioStation == lastRadioStation) {
            currentRadioStation = firstRadioStation;
            return;
        }
        currentRadioStation++;
    }

    public void switchToPrevStation() {
        if (currentRadioStation == firstRadioStation) {
            currentRadioStation = lastRadioStation;
            return;
        }
        currentRadioStation--;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            this.volume = maxVolume;
            return;
        }
        if (volume < minVolume) {
            this.volume = minVolume;
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume == maxVolume) {
            this.volume = maxVolume;
            return;
        }
        volume++;
    }

    public void decreaseVolume() {
        if (volume == minVolume) {
            this.volume = minVolume;
            return;
        }
        volume--;
    }
}
