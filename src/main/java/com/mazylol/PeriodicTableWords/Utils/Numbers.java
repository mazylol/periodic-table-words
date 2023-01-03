package com.mazylol.PeriodicTableWords.Utils;

import java.util.Random;

public class Numbers {
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
