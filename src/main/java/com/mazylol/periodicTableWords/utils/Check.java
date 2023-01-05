package com.mazylol.periodicTableWords.utils;

import static com.mazylol.periodicTableWords.Main.count;

public class Check {
    public static boolean CheckWord(String word, String[] words) {
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
