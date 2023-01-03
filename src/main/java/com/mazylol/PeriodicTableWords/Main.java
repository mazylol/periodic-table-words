package com.mazylol.PeriodicTableWords;

import com.mazylol.PeriodicTableWords.Utils.Files;
import com.mazylol.PeriodicTableWords.Utils.Numbers;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Files.GetArray("words_alpha.txt");
        List<String> elements = Files.GetArray("elements.txt");

        assert words != null;
        assert elements != null;

        for (int i = 0; i < 1000; i++) {
            int n1 = Numbers.getRandomNumber(0, 118);
            int n2 = Numbers.getRandomNumber(0, 118);
            int n3 = Numbers.getRandomNumber(0, 118);
            int n4 = Numbers.getRandomNumber(0, 118);

            String word = elements.get(n1) + elements.get(n2) + elements.get(n3) + elements.get(n4);

            for (int x = 0; x < words.size(); x++) {
                if (word.toLowerCase() == words.get(x)) {
                    System.out.println(word.toLowerCase());
                }
            }
        }
    }
}