package com.csmithswim;

public class ElectricEngine extends Car implements Engine {

    public int batteryCharge;

    public ElectricEngine(String engine, int speed, String type, int year, int batteryCharge) {
        super(engine, speed, type, year);
        this.batteryCharge = batteryCharge;
    }

    @Override
    public void accelerate(int increment) {

        speed = increment + speed;
        batteryCharge = batteryCharge - (increment/8);

    }

    @Override
    public void brake(int decrement) {

        speed = decrement + speed;

    }

    //Display message
    @Override
    public String toString(){return "The " + year +" " + type + " is going " + speed + " mph" + " and has a battery charge of " + batteryCharge;}

}
