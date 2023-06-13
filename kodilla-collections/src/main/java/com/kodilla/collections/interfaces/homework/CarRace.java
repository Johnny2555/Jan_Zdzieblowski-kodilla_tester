package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
    Ford ford = new Ford(10);
    doRace(ford);
    Opel opel = new Opel(20);
    doRace(opel);
    }
    public static void doRace(Car car){
        for (int i=0; i<3;i++){
            car.increaseSpeed();
        }
        for (int i=0; i<2; i++){
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }
}
