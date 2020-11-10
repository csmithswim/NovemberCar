package com.csmithswim;

public class GasEngine extends Car implements Engine {

    public int gasTankPercentage;

    public GasEngine(String engine, int speed, String type, int year, int gasTankPercentage) {
        super(engine, speed, type, year);
    }


    @Override
    public void accelerate(int increment) {
        speed = increment + speed;
        gasTankPercentage = gasTankPercentage - (increment/5);
    }

    @Override
    public void brake(int decrement) {

        speed = decrement + speed;

    }
}


