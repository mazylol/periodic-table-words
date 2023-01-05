package com.mazylol.PeriodicTableWords;

import com.mazylol.PeriodicTableWords.Utils.Files;
import com.mazylol.PeriodicTableWords.Utils.Numbers;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String[] words = Files.GetWords();
        String[] elements = Files.GetElements();

        for (int i = 0; i < 10000; i++) {
            String word = "";
            int state = 0; // 0: one 1: two 2: three etc

            if (state == 0) {
                for (String e : elements) {
                    
                }
            }
            
            for (String s : words) {
                if (word.toLowerCase().equals(s)) {
                    System.out.println(word.toLowerCase());
                }
            }
        }
    }
}