package com.mazylol.PeriodicTableWords.Utils;

import java.io.FileNotFoundException;

import static com.mazylol.PeriodicTableWords.Main.count;

public class Check {
    public static boolean CheckWord(String word, String[] words) throws FileNotFoundException {
        boolean out = false;

        for (String s : words) {
            if (word.toLowerCase().equals(s)) {
                out = true;
                count++;
                break;
            }
        }

        return out;
    }
}
