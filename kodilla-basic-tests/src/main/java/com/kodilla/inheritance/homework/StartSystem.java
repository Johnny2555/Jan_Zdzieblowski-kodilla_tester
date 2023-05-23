package com.kodilla.inheritance.homework;

import java.time.Year;

public class StartSystem {
    public static void main(String [] args){
        OperatingSystem system = new OperatingSystem(1980);
        system.turnOnSystem();
        system.turnOffSystem();
        System.out.println("Year is: " +system.getYear());


    }
}
