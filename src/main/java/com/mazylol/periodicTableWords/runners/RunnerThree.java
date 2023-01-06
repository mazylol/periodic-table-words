package com.mazylol.periodicTableWords.runners;

import com.mazylol.periodicTableWords.utils.Check;

public class RunnerThree implements Runnable {
    private final String[] words;
    private final String[] elements;

    public RunnerThree(String[] words, String[] elements) {
        this.words = words;
        this.elements = elements;
    }

    public void run() {
        loop(elements, words);
    }

    public static void loop(String[] elements, String[] words) {
        for (String e1 : elements) {
            for (String e2 : elements) {
                for (String e3 : elements) {
                    if (Check.CheckWord(e1 + e2 + e3, words)) {
                        System.out.println(e1.toLowerCase() + e2.toLowerCase() + e3.toLowerCase());
                    }
                }
            }
        }
    }
}
