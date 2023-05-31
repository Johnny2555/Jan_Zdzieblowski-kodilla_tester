package com.kodilla.basic_assertion;

import com.kodilla.abstracts.basic_assertion.Calculator;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        assertEquals(13, sumResult);
        }
        @Test

        public  void testSubstract(){
            Calculator calculator = new Calculator();
            int a = 5;
            int b = 8;
            int subResult = calculator.substract(a,b);
            assertEquals(-3,subResult);
        }
        @Test
        public void testPotega(){
            int c = 4;
            double delta = 0.0 ;
            Calculator calculator = new Calculator();
            double result = calculator.potega(c);
            assertEquals(16,result,delta);
        }
    @Test
    public void testPotegaMinus(){
        int c = -4;
        double delta = 0.0 ;
        Calculator calculator = new Calculator();
        double result = calculator.potega(c);
        assertEquals(16,result,delta);
    }
    @Test
    public void testPotegaZero(){
        int c = 0;
        double delta = 0.0 ;
        Calculator calculator = new Calculator();
        double result = calculator.potega(c);
        assertEquals(0,result,delta);
    }
}

