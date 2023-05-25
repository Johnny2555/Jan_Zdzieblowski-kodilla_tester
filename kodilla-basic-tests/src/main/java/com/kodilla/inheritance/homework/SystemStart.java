package com.kodilla.inheritance.homework;

public class SystemStart {
    public static void main(String [] args){
        OperatingSystem system = new OperatingSystem(1980);
        system.turnOn();
        system.turnOff();
        System.out.println("Year is: " +system.getYear());


    }
}
