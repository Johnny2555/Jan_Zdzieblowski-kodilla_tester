package com.kodilla.abstracts;

public class Kwadrat extends Shape{
    private double widht;

    public Kwadrat( double widht){
        this.widht =widht;
    }


    @Override
    public double calculateArea() {
        return widht * widht;
    }

    @Override
    public double calculateCircuit() {
        return 4 * widht;
    }
}
