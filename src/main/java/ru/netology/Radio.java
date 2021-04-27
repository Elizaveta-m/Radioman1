package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentRadioStation;
    private int firstRadioStation = 0;
    private int lastRadioStation = 10;
    private int volume;
    private int minVolume = 0;
    private int maxVolume = 100;

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
