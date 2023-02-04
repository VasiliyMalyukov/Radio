package ru.netology.javaqamvn.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testSetCurrentStation() {
        Radio station = new Radio();

        station.setCurrentStation(6);

        int expected = 6;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSetCurrentStationAboveUpperLimit() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(4);

        station.nextStation();

        int expected = 5;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationOverLimit() {
        Radio station = new Radio();
        station.setCurrentStation(9);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStation() {
        Radio station = new Radio();
        station.setCurrentStation(6);

        station.previousStation();

        int expected = 5;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStationLowerLimit() {
        Radio station = new Radio();
        station.setCurrentStation(0);

        station.previousStation();

        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentVolume() {
        Radio volume = new Radio();

        volume.setCurrentVolume(7);

        int expected = 7;
        int actual = volume.getCurrentVolume();
    }

    @Test
    public void testSetCurrentVolumeMax() {
        Radio volume = new Radio();

        volume.setCurrentVolume(11);

        int expected = 0;
        int actual = volume.getCurrentVolume();
    }

    @Test
    public void testVolumeUp() {
        Radio volume = new Radio();
        volume.setCurrentVolume(6);

        volume.volumeUp();

        int expected = 7;
        int actual = volume.getCurrentVolume();
    }

    @Test
    public void testVolumeUpMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);

        volume.volumeUp();

        int expected = 10;
        int actual = volume.getCurrentVolume();
    }

    @Test
    public void testVolumeDown() {
        Radio volume = new Radio();
        volume.setCurrentVolume(6);

        volume.volumeDown();

        int expected = 5;
        int actual = volume.getCurrentVolume();
    }

    @Test
    public void testVolumeDownMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);

        volume.volumeDown();

        int expected = 0;
        int actual = volume.getCurrentVolume();
    }
}