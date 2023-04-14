package com.kodilla;

public class MainExtended {
    public static void main(String[] args) {
        String myName = "Jan";
        int myAge = 22;
        double height = 1.78;
        char carClass = 'A';
        boolean isGoodProgrammer = true;
        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(height);
        System.out.println(carClass);
        System.out.println(isGoodProgrammer);
    }

    public static class FirstClass {
        public static void main(String[] args) {
            System.out.println("Hello from com.kodilla.MainExtended.FirstClass!");

            if (1 > 2){
                System.out.println("Niesamowite! Jeden jest większe niż dwa!!!");
            }
        }
    }
}

