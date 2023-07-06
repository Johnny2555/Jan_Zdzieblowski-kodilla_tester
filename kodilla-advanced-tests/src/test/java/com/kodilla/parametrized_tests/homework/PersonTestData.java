package com.kodilla.parametrized_tests.homework;

public class PersonTestData {
    private double height;
    private double weight;
    private String expectedBMI;

    public PersonTestData(double height, double weight, String expectedBMI) {
        this.height = height;
        this.weight = weight;
        this.expectedBMI = expectedBMI;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getExpectedBMI() {
        return expectedBMI;
    }
}
