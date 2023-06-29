package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Warehouse {
    private List<Order> orders;
    public Warehouse(){
        orders = new ArrayList<>();
    }
    public void addOrder(Order order){
        orders.add(order);
    }
    public Order getOrder (String number) throws OrderDoesntExistException{
        List<Order> foundOrders = orders.stream()
                .filter(o -> o.getNumber().equals(number))
                .collect(Collectors.toList());
        if (foundOrders.isEmpty()){
            throw new OrderDoesntExistException("Order with number" + number + " doesn't exist in the warehouse.");

        }
        return  foundOrders.get(0);
    }

}
