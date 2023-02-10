package ru.netology.javaqamvn.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio (int stationCount) {
        this.maxStation = stationCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    //Выбор радиостанции напрямую:
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    //Переключение станции вперёд:
    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    //Переключение станции назад:
    public void previousStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    //Текущая громкость:
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 100) {
            currentVolume = newCurrentVolume;
        }
    }

    //Увеличение громкости на 1:
    public void volumeUp() {
        if (currentVolume < 100) {
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
