package com.csmithswim;

public class Car {
    protected String engine;

    //Three unique fields
    protected int speed;
    protected String type;
    protected int year;

    public Car(String engine, int speed, String type, int year){
        this.engine = engine;
        this.speed = speed;
        this.type = type;
        this.year = year;
    }

}
