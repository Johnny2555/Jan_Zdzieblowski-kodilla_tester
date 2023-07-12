package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
        private List<Order> orders = new ArrayList<>();

        public void addOrder(Order order) {
            orders.add(order);
        }

        public List<Order> getOrdersInDateRange(LocalDate startDate, LocalDate endDate) {
            List<Order> filteredOrders = new ArrayList<>();
            for (Order order : orders) {
                LocalDate orderDate = order.getDate();
                if (orderDate.isEqual(startDate) || orderDate.isEqual(endDate) || (orderDate.isAfter(startDate) && orderDate.isBefore(endDate))) {
                    filteredOrders.add(order);
                }
            }
            return filteredOrders;
        }

        public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
            List<Order> filteredOrders = new ArrayList<>();
            for (Order order : orders) {
                double orderValue = order.getValue();
                if (orderValue >= minValue && orderValue <= maxValue) {
                    filteredOrders.add(order);
                }
            }
            return filteredOrders;
        }

        public int getNumberOfOrders() {
            return orders.size();
        }

        public double getTotalValueOfOrders() {
            double totalValue = 0;
            for (Order order : orders) {
                totalValue += order.getValue();
            }
            return totalValue;
        }
    }



