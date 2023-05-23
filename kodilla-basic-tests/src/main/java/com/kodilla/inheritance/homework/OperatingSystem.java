package com.kodilla.inheritance.homework;

import java.time.Year;

public class OperatingSystem {
    private int year;

    public OperatingSystem (int year){
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void turnOnSystem(){
        System.out.println("System turn on");
    }
    public void  turnOffSystem(){
        System.out.println("System turn off");
    }


}
