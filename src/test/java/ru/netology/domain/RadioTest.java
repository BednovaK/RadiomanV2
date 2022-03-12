package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

//    Можно задавать количество радиостанций при создании объекта (по умолчанию - 10)

    @Test
    public void shouldSetQuantityStation() {
        Radio rad = new Radio(50);
        assertEquals(50, rad.getQuantityStation());

    }

    @Test
    public void shouldSetQuantityStationDefault() {
        Radio rad = new Radio();
        assertEquals(10, rad.getQuantityStation());

    }

    //Номер текущей радиостанции изменяется в пределах от 0 до количества радиостанций, указанных при создании (см. п.1)
//    Клиент должен иметь возможность выставлять номер радиостанции с цифрового пульта (вводя числа 0 - количество станций)
    @Test
    void shouldSetCurrentStationWithCustomQuantity() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(30);
        assertEquals(30, rad.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithCustomQuantityOver() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(60);
        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithCustomQuantity2() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(48);
        assertEquals(48, rad.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithCustomQuantityBelow() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(-1);
        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    void shouldSetNextStationWithCustomQuantity() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(23);
        rad.increaseStation();

        assertEquals(24, rad.getCurrentStation());
    }

    @Test
    void shouldSetNextStationWithCustomQuantityOverMax() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(49);
        rad.increaseStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    void shouldSetPrevStationWithCustomQuantity() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(24);
        rad.prevStation();

        assertEquals(23, rad.getCurrentStation());
    }

    @Test
    void shouldSetPrevStationWithCustomQuantityBelowMin() {
        Radio rad = new Radio(50);
        rad.setCurrentStation(0);
        rad.prevStation();

        assertEquals(49, rad.getCurrentStation());
    }

    @Test
    void shouldSetPrevStationWithDefaultQuantity() {
        Radio rad = new Radio();
        rad.setCurrentStation(0);
        rad.prevStation();

        assertEquals(9, rad.getCurrentStation());
    }


    @Test
    void shouldSetNextStationWithDefaultQuantity4() {
        Radio rad = new Radio();
        rad.setCurrentStation(9);
        rad.increaseStation();

        assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void volumeIncrease() {
        Radio rad = new Radio();

        rad.setCurrentVolume(5);
        rad.increaseVolume();

        assertEquals(6, rad.getCurrentVolume());
    }

    @Test
    public void volumeIncreaseMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.increaseVolume();

        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void volumeOverMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void volumeLower() {
        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.lowerVolume();

        assertEquals(98, rad.getCurrentVolume());
    }
    @Test
    public void volumeBelowMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.lowerVolume();

        assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void currentVolumeOverMax() {
        Radio rad = new Radio();

        rad.setCurrentVolume(101);
        rad.increaseVolume();

        assertEquals(1, rad.getCurrentVolume());
    }

    @Test
    public void currentVolumeOverMin() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        rad.increaseVolume();

        assertEquals(1, rad.getCurrentVolume());
    }
}


