package ru.netology.services.hwradio.radioservise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStation() {
        Radio radioStston = new Radio();

        radioStston.currentRadioStation = 2;

        int expected = 2;
        int actual = radioStston.currentRadioStation;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ShouldNotSetVolumeAboveMax() { //если звук на 100, добавляем+1
        Radio volume = new Radio();

        volume.currentVolume = 100;

        volume.increaseVolumeByOne();

        int expected = 0;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetVolumeMaxIfVolume99() { //если звук на 99, добавляем +1
        Radio volume = new Radio();

        volume.currentVolume = 99;

        volume.increaseVolumeByOne();

        int expected = 100;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetVolumeIfVolume0() { //если звук на 0, добавляем +1
        Radio volume = new Radio();

        volume.currentVolume = 0;

        volume.increaseVolumeByOne();

        int expected = 1;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSetVolumeIfVolume1() { //если звук на 1, добавляем +1
        Radio volume = new Radio();

        volume.currentVolume = 1;

        volume.increaseVolumeByOne();

        int expected = 2;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldNotSetVolumeBelowMin() { //если звук 0, уменьшаем на 1
        Radio volume = new Radio();

        volume.currentVolume = 0;

        volume.reduceVolumeByOne();

        int expected = 0;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldReducedVolumeIfVolume1() { //если звук 0, уменьшаем на 1
        Radio volume = new Radio();

        volume.currentVolume = 1;

        volume.reduceVolumeByOne();

        int expected = 0;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldReducedVolumeIfVolume2() { //если звук 2, уменьшаем на 1
        Radio volume = new Radio();

        volume.currentVolume = 2;

        volume.reduceVolumeByOne();

        int expected = 1;
        int actual = volume.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}
