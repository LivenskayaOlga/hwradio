package ru.netology.services.hwradio.radioservise;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolumeByOne() { //увеличения звука на 1
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolumeByOne() {  //уменьшения звука на 1
        if (currentVolume <= 100) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation != 9) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 8;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
    }
}
