package com.kodilla.execution_model.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
class ShopTestSuite {
    @Test
    public void shouldAddOrder() {

        Shop shop = new Shop();
        Order order = new Order(100.0, LocalDate.now(), "john123");

        shop.addOrder(order);

        assertEquals(1, shop.getNumberOfOrders());
    }

    @Test
    public void shouldReturnOrdersInDateRange() {

        Shop shop = new Shop();
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 12, 31);
        Order order1 = new Order(100.0, LocalDate.of(2023, 3, 15), "john123");
        Order order2 = new Order(200.0, LocalDate.of(2023, 7, 10), "mary456");
        Order order3 = new Order(150.0, LocalDate.of(2022, 11, 20), "sam789");
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);


        List<Order> ordersInDateRange = shop.getOrdersInDateRange(startDate, endDate);

        assertEquals(2, ordersInDateRange.size());
        assertTrue(ordersInDateRange.contains(order1));
        assertTrue(ordersInDateRange.contains(order2));
    }

    @Test
    public void shouldReturnOrdersByValueRange() {

        Shop shop = new Shop();
        double minValue = 100.0;
        double maxValue = 200.0;
        Order order1 = new Order(100.0, LocalDate.of(2023, 3, 15), "john123");
        Order order2 = new Order(200.0, LocalDate.of(2023, 7, 10), "mary456");
        Order order3 = new Order(150.0, LocalDate.of(2022, 11, 20), "sam789");
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);


        List<Order> ordersByValueRange = shop.getOrdersByValueRange(minValue, maxValue);


        assertEquals(3, ordersByValueRange.size());
        assertTrue(ordersByValueRange.contains(order1));
        assertTrue(ordersByValueRange.contains(order2));
        assertTrue(ordersByValueRange.contains(order3));


    }

    @Test
    public void shouldReturnNumberOfOrders() {

        Shop shop = new Shop();
        Order order1 = new Order(100.0, LocalDate.of(2023, 3, 15), "john123");
        Order order2 = new Order(200.0, LocalDate.of(2023, 7, 10), "mary456");
        shop.addOrder(order1);
        shop.addOrder(order2);

        int numberOfOrders = shop.getNumberOfOrders();

       assertEquals(2, numberOfOrders);
    }

    @Test
    public void shouldReturnTotalValueOfOrders() {
        Shop shop = new Shop();
        Order order1 = new Order(100.0, LocalDate.of(2023, 3, 15), "john123");
        Order order2 = new Order(200.0, LocalDate.of(2023, 7, 10), "mary456");
        shop.addOrder(order1);
        shop.addOrder(order2);

        double totalValue = shop.getTotalValueOfOrders();

        assertEquals(300.0, totalValue);
    }


}