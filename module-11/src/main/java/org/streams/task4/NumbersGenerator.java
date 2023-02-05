package org.streams.task4;

import java.util.stream.Stream;

public class NumbersGenerator {
    public static Stream<Long> getLinearCongruentOscillator(long a, long c, long m) {
        return Stream.iterate(0L, x -> (a * x + c) % m);
    }
}
