package com.kodilla.collections.arrays.homework;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    public static Car drawCar(){
        Random random = new Random();
        int carType = random.nextInt(2);
        int speed = random.nextInt(100);
        if(carType == 0){
            return new Ford(speed);
        }else {
            return new Opel(speed);
        }
    }

    public static void main(String[] args) {
        Car [] cars = new Car[15];
        for (int i=0; i< cars.length;i++)
            cars[i] =drawCar();
        for (Car car: cars)
            CarUtils.describeCar(car);



    }
}
