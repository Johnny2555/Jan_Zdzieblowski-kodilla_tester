package com.kodilla.inheritance.homework;
public class OperatingSystem {
    private int year;


    public OperatingSystem(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void turnOn() {
        System.out.println("Turning on the operating system");
    }

    public void turnOff() {
        System.out.println("Turning off the operating system");
    }
}

