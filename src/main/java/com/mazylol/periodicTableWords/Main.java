package com.mazylol.periodicTableWords;

import com.mazylol.periodicTableWords.runners.RunnerOne;
import com.mazylol.periodicTableWords.runners.RunnerThree;
import com.mazylol.periodicTableWords.runners.RunnerTwo;
import com.mazylol.periodicTableWords.utils.Files;

import java.io.FileNotFoundException;

public class Main {
    public static int count = 0;

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        String[] words = Files.GetWords();
        String[] elements = Files.GetElements();

        Thread t1 = new Thread(new RunnerOne(words, elements));
        Thread t2 = new Thread(new RunnerTwo(words, elements));
        Thread t3 = new Thread(new RunnerThree(words, elements));

        t1.start();
        t2.start();
        //t3.start();

        t1.join();
        t2.join();

        System.out.println("\nThere were " + count + " words!");
    }
}
