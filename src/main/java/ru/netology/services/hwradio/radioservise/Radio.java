package ru.netology.services.hwradio.radioservise;

public class Radio {
    private int amountRadioStation;
    private int currentRadioStation;
    private int currentVolume;

    public Radio() {
        this.currentRadioStation = 9;
        this.amountRadioStation = 10;
    }

    public Radio(int amountRadioStation) {
        if (amountRadioStation > 0) {
            this.currentRadioStation = amountRadioStation - 1;
            this.amountRadioStation = amountRadioStation;
        } else {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getAmountRadioStation() {
        return amountRadioStation = currentRadioStation;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > amountRadioStation - 1) {
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
        if (currentRadioStation < amountRadioStation - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation != amountRadioStation - 1) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = amountRadioStation - 2;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = amountRadioStation - 1;
        }
    }

}
