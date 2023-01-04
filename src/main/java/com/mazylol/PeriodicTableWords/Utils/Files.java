package com.mazylol.PeriodicTableWords.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Files {
    public static String[] GetWords() throws FileNotFoundException {
        String[] words = new String[370105];

        Scanner scanner = new Scanner(new File("words_alpha.txt"));

        int i = 0;
        while (scanner.hasNextLine()) {
            words[i] = scanner.nextLine();
            i++;
        }

        scanner.close();

        return words;
    }

    public static String[] GetElements() throws FileNotFoundException {
        String[] elements = new String[118];

        Scanner scanner = new Scanner(new File("elements.txt"));

        int i = 0;
        while (scanner.hasNextLine()) {
            elements[i] = scanner.nextLine();
            i++;
        }

        scanner.close();

        return elements;
    }
}
