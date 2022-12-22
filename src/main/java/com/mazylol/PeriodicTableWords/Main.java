package com.mazylol.PeriodicTableWords;

import com.mazylol.PeriodicTableWords.Utils.Files;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = Files.GetArray("words_alpha.txt");
        List<String> elements = Files.GetArray("elements.txt");

        assert words != null;
        assert elements != null;

        System.out.println(elements.get(47));
        System.out.println(words.get(89));
    }
}