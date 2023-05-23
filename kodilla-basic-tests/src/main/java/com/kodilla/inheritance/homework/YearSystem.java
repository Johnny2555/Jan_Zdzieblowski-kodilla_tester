package com.kodilla.inheritance.homework;

public class YearSystem extends OperatingSystem {
    public YearSystem(int year){
        super(year);
    }


    @Override
    public void turnOnSystem() {
        System.out.println("System start");
    }

    @Override
    public void turnOffSystem() {
        System.out.println("System down");
    }
}
