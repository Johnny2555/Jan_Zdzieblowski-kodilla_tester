package com.kodilla;


    public class Loops
    {public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
        public int sumNumbers(int[] numbers) {
        int rating = 1;
        int result = 0;
            for (int i = 0; i < numbers.length; i++) {
                result = result + numbers[i];
            }
            return result;
        }

    }




