package ru.netology.javaqamvn.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //Выбор радиостанции напрямую:
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= 9) {
            currentStation = newCurrentStation;
        }
    }

    //Переключение станции вперёд:
    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    //Переключение станции назад:
    public void previousStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
    }

    //Текущая громкость:
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 10) {
            currentVolume = newCurrentVolume;
        }
    }

    //Увеличение громкости на 1:
    public void volumeUp() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    //Уменьшение громкости на 1:
    public void volumeDown() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}
