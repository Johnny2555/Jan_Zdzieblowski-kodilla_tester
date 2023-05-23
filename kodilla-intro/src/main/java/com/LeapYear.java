package com.kodilla;

public class LeapYear {
    public static void main(String[] args) {
        int leapYear = 2016;
        System.out.println(leapYear);


        if ((leapYear % 4 == 0 && leapYear % 100 != 0) || leapYear % 400 == 0) {
            System.out.println("Ten rok jest przestepny.");
        } else {
            System.out.println("Ten rok nie jest przestepny.");
        }
    }
    }


