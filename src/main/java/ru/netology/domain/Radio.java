package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return volume;
    }

    public void setToMaxStation() {
        this.currentStation = 9;
    }

    public void setToMinStation() {
        this.currentStation = 0;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseStation() {

        if (currentStation < 9) {
            currentStation = currentStation + 1;
            return;
        }

        this.currentStation = 0;
    }




    public void prevStation() {
        if (currentStation > 1) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            this.currentStation = 9;
        }
    }


    public void setCurrentVolume(int volume) {
        if (volume > 10) {
            return;
        }
        if (volume < 0) {
            return;
        }
        this.volume = volume;
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void lowerVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}