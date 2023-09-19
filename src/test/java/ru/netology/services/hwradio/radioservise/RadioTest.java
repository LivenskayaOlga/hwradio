package ru.netology.services.hwradio.radioservise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldNotSetVolumeAboveMax() { //если звук на 100, добавляем+1
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        volume.increaseVolumeByOne();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMaxIfVolume99() { //если звук на 99, добавляем +1
        Radio volume = new Radio();

        volume.setCurrentVolume(99);

        volume.increaseVolumeByOne();

        int expected = 100;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfVolume0() { //если звук на 0, добавляем +1
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        volume.increaseVolumeByOne();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeIfVolume1() { //если звук на 1, добавляем +1
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        volume.increaseVolumeByOne();

        int expected = 2;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() { //если звук 0, уменьшаем на 1
        Radio volume = new Radio();

        volume.setCurrentVolume(0);

        volume.reduceVolumeByOne();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReducedVolumeIfVolume1() { //если звук 1, уменьшаем на 1
        Radio volume = new Radio();

        volume.setCurrentVolume(1);

        volume.reduceVolumeByOne();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReducedVolumeIfVolume2() { //если звук 2, уменьшаем на 1
        Radio volume = new Radio();

        volume.setCurrentVolume(2);

        volume.reduceVolumeByOne();

        int expected = 1;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReducedVolumeIfVolume100() { //если звук 100, уменьшаем на 1
        Radio volume = new Radio();

        volume.setCurrentVolume(100);

        volume.reduceVolumeByOne();

        int expected = 99;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReducedVolumeIfVolume99() { //если звук 99, уменьшаем на 1
        Radio volume = new Radio();

        volume.setCurrentVolume(99);

        volume.reduceVolumeByOne();

        int expected = 98;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReducedVolumeIfVolume101() { //если звук 101, уменьшаем на 1
        Radio volume = new Radio();

        volume.setCurrentVolume(101);

        volume.reduceVolumeByOne();

        int expected = 0;
        int actual = volume.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationByMax() { //установка радиостанции номер 9
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(9);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationByTen() { //установка радиостанции номер 10
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(10);

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetRadioStationByNegativ() { //установка радиостанции номер -1
        Radio radioStation = new Radio(-1);

        radioStation.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextRadioStationByZero() { //некст: после 0й идет 1я
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(0);

        radioStation.nextRadioStation();

        int expected = 1;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationByNine() { //некст: после 9й идет 0я
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(9);

        radioStation.nextRadioStation();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStationByFive() { //некст: после 5й идет 6я
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(5);

        radioStation.nextRadioStation();

        int expected = 6;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationByOne() { //прев: после 1й будет 0я
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(1);

        radioStation.prevRadioStation();

        int expected = 0;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationByZwero() { //прев: после 0й будет 9я
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(0);

        radioStation.prevRadioStation();

        int expected = 9;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationByNine() { //прев: c 9й yf 8.
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(9);

        radioStation.prevRadioStation();

        int expected = 8;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevRadioStationByFive() { //прев: c 5й yf 4
        Radio radioStation = new Radio();

        radioStation.setCurrentRadioStation(5);

        radioStation.prevRadioStation();

        int expected = 4;
        int actual = radioStation.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDefaultAmountRadioStation() { // по умолчанию 10 станций
        Radio radioStation = new Radio();

        Assertions.assertEquals(9, radioStation.getAmountRadioStation());

    }

    @Test
    public void shouldSetNegativAmountRadioStation() { // установитьотрицательное число
        Radio radioStation = new Radio(-5);


        Assertions.assertEquals(0, radioStation.getAmountRadioStation());

    }

    @Test
    public void shouldSetAmountRadioStationByZero() { // установить 0 радиостанций
        Radio radioStation = new Radio(0);


        Assertions.assertEquals(0, radioStation.getAmountRadioStation());

    }

    @Test
    public void shouldSetAmountRadioStationByOne() { // установить 1 радиостанций
        Radio radioStation = new Radio(1);

        Assertions.assertEquals(0, radioStation.getAmountRadioStation());

    }

    @Test
    public void shouldSetAmountRadioStationByTwo() { // установить 1 радиостанций
        Radio radioStation = new Radio(2);

        Assertions.assertEquals(1, radioStation.getAmountRadioStation());

    }

    @Test
    public void shouldSetAmountRadioStationByElevenSwitchNext() {
        Radio radioStation = new Radio(11);

        radioStation.setCurrentRadioStation(10);

        radioStation.nextRadioStation();
        Assertions.assertEquals(0, radioStation.getCurrentRadioStation());

    }

    @Test
    public void shouldSetAmountRadioStationByTwentySwitchNext() { //
        Radio radioStation = new Radio(20);

        radioStation.setCurrentRadioStation(10);

        radioStation.nextRadioStation();

        Assertions.assertEquals(11, radioStation.getCurrentRadioStation());

    }

    @Test
    public void shouldSetAmountRadioStationByTwentySwitchPrew() { //
        Radio radioStation = new Radio(20);

        radioStation.setCurrentRadioStation(0);

        radioStation.prevRadioStation();

        Assertions.assertEquals(19, radioStation.getCurrentRadioStation());

    }

    @Test
    public void shouldSetAmountRadioStationSwitchPrew() { //
        Radio radioStation = new Radio(20);

        radioStation.setCurrentRadioStation(8);

        radioStation.prevRadioStation();

        Assertions.assertEquals(7, radioStation.getCurrentRadioStation());

    }


}

