package ru.netology.javaqamvn.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioStationCountTest {

    @Test
    public void testSetCurrentStation() {
        Radio radio = new Radio(60);

        radio.setCurrentStation(59);

        Assertions.assertEquals(59, radio.getCurrentStation());
    }

    @Test
    public void testSetCurrentStationAboveUpperLimit() {
        Radio station = new Radio(60);

        station.setCurrentStation(60);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSetCurrentStationBelowUpperLimit() {
        Radio station = new Radio(60);

        station.setCurrentStation(-2);

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStation() {
        Radio station = new Radio(60);
        station.setCurrentStation(58);

        station.nextStation();

        int expected = 59;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextStationOverLimit() {
        Radio station = new Radio(60);
        station.setCurrentStation(59);

        station.nextStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStation() {
        Radio station = new Radio(60);
        station.setCurrentStation(1);

        station.previousStation();

        int expected = 0;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPreviousStationLowerLimit() {
        Radio station = new Radio(60);
        station.setCurrentStation(0);

        station.previousStation();

        int expected = 59;
        int actual = station.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
