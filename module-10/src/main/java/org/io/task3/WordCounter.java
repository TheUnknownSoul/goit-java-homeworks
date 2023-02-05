package org.io.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Uses system property to get absolute path of user`s directory and concatenates with project file folder path.
 * Note that this path is correct for Linux-based operations systems. For Windows use \ slash.
 * After getting path read file line by line and split result with regular expression.
 * Each word put in to map, count words amount and then sorting.
 */
public class WordCounter {
    public static void countWords() {
        String pathToFile = System.getProperty("user.dir") + "/goit-io-homework/src/main/java/org/io/files/words.txt";
        Map<String, Integer> map = new TreeMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] strings = line.split("\\W");
                for (String word : strings) {
                    if (word.isEmpty()) {
                        continue;
                    }
                    if (map.containsKey(word)) {
                        map.put(word, map.get(word) + 1);
                    } else {
                        map.put(word, 1);
                    }
                }
            }
            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
            list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
            System.out.println(list);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot find file " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        countWords();
    }
}
