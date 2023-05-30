package com.kodilla.abstracts.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 4;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int subResult = calculator.substract(a,b);
        boolean correct1 = ResultChecker.assertEquals(-3,subResult);
        if (correct1){
            System.out.println("Metoda substract działa poprawnie dla liczb " + a + " i " +b);
        }else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + a + " i " +b);
        }
        int potResult = calculator.potega(c);
        boolean correct2 = ResultChecker.assertEquals(16,potResult);
        if (correct2){
            System.out.println("Metoda potega działa poprawnie dla liczb "+ c);
        }else {
            System.out.println("Metoda nie działa poprawnie dla liczb "+ c);
        }
    }
}
