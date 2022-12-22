package com.mazylol.PeriodicTableWords.Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Files {

    public static List<String> GetArray(String path) {
        try {
            Scanner scanner = new Scanner(new File(path));

            List<String> list = new ArrayList<>();

            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }

            scanner.close();

            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            return null;
        }
    }
}
