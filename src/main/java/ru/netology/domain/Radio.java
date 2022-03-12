package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int volume;
    private int volumeMax = 100;
    private int volumeMin = 0;
    private int quantityStation = 10;


    //конструктор с количеством радиостанций
    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    //конструктор по умолчанию
    public Radio() {
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation > (quantityStation - 1)) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void increaseStation() {

        if (currentStation == (quantityStation - 1)) {
            setCurrentStation(0);
            return;
        }
        setCurrentStation(++currentStation);

    }

    public void prevStation() {

        if (currentStation == 0) {
            setCurrentStation(quantityStation - 1);
            return;
        }
        setCurrentStation(--currentStation);

    }

    public int getCurrentVolume() {
        return volume;
    }

    public void setCurrentVolume(int volume) {
        if (volume > volumeMax) {
            return;
        }
        if (volume < volumeMin) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < volumeMax) {
            volume = volume + 1;
        }
    }

    public void lowerVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}

