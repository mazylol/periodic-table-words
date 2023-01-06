package com.mazylol.periodicTableWords.runners;

import com.mazylol.periodicTableWords.utils.Check;

public class RunnerTwo implements Runnable {
    private final String[] words;
    private final String[] elements;

    public RunnerTwo(String[] words, String[] elements) {
        this.words = words;
        this.elements = elements;
    }

    public void run() {
        loop(words, elements);
    }
    private void loop(String[] words, String[] elements) {
        for (String e1 : elements) {
            for (String e2 : elements) {
                if (Check.CheckWord(e1 + e2, words)) {
                    System.out.println(e1.toLowerCase() + e2.toLowerCase());
                }
            }
        }
    }


}
