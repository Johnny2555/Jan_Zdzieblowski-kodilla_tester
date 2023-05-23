package com.kodilla;

            public class Notebook {
                int weight;
                int price;
                int year;


                public Notebook(int weight, int price, int year) {
                    this.weight = weight;
                    this.price = price;
                    this.year = year;
                }
                public void checkYear() {
                    if (this.year > 2018 && this.price > 1500) {
                        System.out.println("This notebook it was produced later than 2018.");
                    } else if (this.year < 2018 && this.price < 1500) {
                        System.out.println("This notebook it was produced before 2018.");
                    } else {
                        System.out.println("This notebook it was not exist.");
                    }
                }
                public void checkWeight() {
                    if (this.weight < 600) {
                        System.out.println("This notebook is not too heavy.");
                    } else if (this.weight == 1600) {
                        System.out.println("This notebook is heavy.");
                    } else {
                        System.out.println("This notebook is too heavy.");
                    }
                }
                public void checkPrice() {
                    if (this.price < 600) {
                        System.out.println("This notebook is very cheap.");
                    } else {
                        if (this.price == 600) {
                            System.out.println("The price is good.");
                        } else {
                            System.out.println("This notebook is expensive.");
                        }

                    }
                }

            }

