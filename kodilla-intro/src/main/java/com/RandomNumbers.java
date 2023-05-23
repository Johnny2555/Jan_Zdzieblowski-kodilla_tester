package com.kodilla;

import java.util.Random;

public class RandomNumbers {

    int sum = 0;
    int min = 30;
    int max = 0;

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public void getNumbers() {
        while (sum < 5000) {
            Random random = new Random();
            int next = random.nextInt(30);
            sum = sum + next;

            if (next > max) max = next;
            if (next < min) min = next;

        }
        //jeśli wylosowana liczba jest większa niż max to staje się nowym maxem jeśli wylosowana liczba jest mniejsza niż min to staję się min
    }
}

