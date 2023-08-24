package ru.netology.services.hwradio.radioservise;

public class Radio {
    public int currentRadioStation;
    public int currentVolume;
   /*public int setCurrentVolume(){
        return currentVolume;
    }*/

    public void increaseVolumeByOne() { //увеличения звука на 1
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 0;
        }
    }

    public void reduceVolumeByOne() {  //уменьшения звука на 1
        if (currentVolume <= 100) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
    }
}
