package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;
public class CarUtils {
    public static void describeCar(Car car){
        System.out.println("Car speed: "+ car.getSpeed());
        System.out.println("Incrase speed: ");
        car.increaseSpeed();
        System.out.println("New speed: "+ car.getSpeed());
        System.out.println("Decrase speed: ");
        car.decreaseSpeed();
        System.out.println("New speed: " + car.getSpeed());
    }

}
