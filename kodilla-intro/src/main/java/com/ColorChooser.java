package com;

import java.util.Scanner;

public class ColorChooser {
    public static String chooseColor() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj pierwszą literę koloru: ");
            String Letter = scanner.nextLine().trim();
            if (Letter.length() >= 2) {
                return Letter;
            }
            System.out.println("Letter is to long");
        }
    }

    public static String getColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select color:");
            String firstLetter = scanner.nextLine().toUpperCase();

            switch (firstLetter) {
                case "R":
                    return "Red";
                case "G":
                    return "Green";
                case "B":
                    return "Blue";
                case "Y":
                    return "Yellow";
                case "O":
                    return "Orange";
                default:
                    System.out.println("Podaj prawidłowy kolor ");
            }
        }
    }

    public static void main(String[] args) {
        String chosenColor = ColorChooser.getColor();
        System.out.println("Wybrany kolor: " + chosenColor);
    }
}


