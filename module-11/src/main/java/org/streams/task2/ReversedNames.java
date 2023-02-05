package org.streams.task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReversedNames {
    public static List<String> getReversedSortedStringsInUppercase(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
