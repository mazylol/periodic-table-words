package com.mazylol.periodicTableWords;

import com.mazylol.periodicTableWords.utils.Check;
import com.mazylol.periodicTableWords.utils.Files;

import java.io.FileNotFoundException;

public class Main {
    public static int count = 0;

    public static void main(String[] args) throws FileNotFoundException {
        String[] words = Files.GetWords();
        String[] elements = Files.GetElements();

        for (String e : elements) {
            if (Check.CheckWord(e, words)) {
                System.out.println(e.toLowerCase());
            }
        }

        for (String e1 : elements) {
            for (String e2 : elements) {
                if (Check.CheckWord(e1 + e2, words)) {
                    System.out.println(e1.toLowerCase() + e2.toLowerCase());
                }
            }
        }

        for (String e1 : elements) {
            for (String e2 : elements) {
                for (String e3 : elements) {
                    if (Check.CheckWord(e1 + e2 + e3, words)) {
                        System.out.println(e1.toLowerCase() + e2.toLowerCase() + e3.toLowerCase());
                    }
                }
            }
        }

        System.out.println("\nThere were " + count + " words!");
    }
}


