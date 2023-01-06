package com.mazylol.periodicTableWords.runners;

import com.mazylol.periodicTableWords.utils.Check;

public class RunnerOne implements Runnable {
    private final String[] words;
    private final String[] elements;

    public RunnerOne(String[] words, String[] elements) {
        this.words = words;
        this.elements = elements;
    }

    public void run() {
        loop(words, elements);
    }

    public void loop(String[] words, String[] elements) {
        for (String e : elements) {
            if (Check.CheckWord(e, words)) {
                System.out.println(e.toLowerCase());
            }
        }
    }
}
