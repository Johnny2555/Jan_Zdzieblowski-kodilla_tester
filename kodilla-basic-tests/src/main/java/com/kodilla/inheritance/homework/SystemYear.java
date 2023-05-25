package com.kodilla.inheritance.homework;

public class SystemYear extends OperatingSystem {
    public SystemYear(int year){
        super(year);
    }


    @Override
    public void turnOn() {
        System.out.println("Booting Windows...");
    }

    @Override
    public void turnOff() {
        System.out.println("Shutting down Windows...");
    }
}
