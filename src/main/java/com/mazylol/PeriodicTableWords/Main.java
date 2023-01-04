package com.mazylol.PeriodicTableWords;

import com.mazylol.PeriodicTableWords.Utils.Files;
import com.mazylol.PeriodicTableWords.Utils.Numbers;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String[] words = Files.GetWords();
        String[] elements = Files.GetElements();

        for (int i = 0; i < 10000; i++) {
            String w1 = elements[Numbers.getRandomNumber(0, 118)];
            String w2 = elements[Numbers.getRandomNumber(0, 118)];
            String w3 = elements[Numbers.getRandomNumber(0, 118)];
            String w4 = elements[Numbers.getRandomNumber(0, 118)];

            String word = w1 + w2 + w3 + w4;

            for (String s : words) {
                if (word.toLowerCase().equals(s)) {
                    System.out.println(word.toLowerCase());
                    System.out.printf("(%s %s %s %s)\n", w1, w2, w3, w4);
                }
            }
        }
    }
}