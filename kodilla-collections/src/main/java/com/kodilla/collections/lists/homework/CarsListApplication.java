package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        Car opel = new Opel(12);
        cars.add(opel);
        cars.add(new Ford(5));

        cars.remove(0);

        Car ford = new Ford(5);
        cars.remove(ford);

        System.out.println(cars.size());


        for (Car car: cars){
            CarUtils.describeCar(car);
        }



        
    }


}
