package org.streams.task3;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SortedArrayNumbers {
    public static void printSortedNumbersFromArray(String[] array) {
        String collect =
                Arrays.
                        stream(array)
                        .flatMap(a -> Stream.of(a.split("\\D+"))
                                .map(Integer::parseInt)
                                .sorted())
                        .sorted()
                        .map(String::valueOf)
                        .distinct()
                        .collect(Collectors.joining(", "));
        System.out.println(collect);

    }
}
