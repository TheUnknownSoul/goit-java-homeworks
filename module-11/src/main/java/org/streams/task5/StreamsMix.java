package org.streams.task5;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class StreamsMix {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterable<T> iterable = () -> new Iterator<>() {
            final Iterator<T> i1 = first.iterator();
            final Iterator<T> i2 = second.iterator();

            boolean nextFirst;

            @Override
            public boolean hasNext() {
                return i1.hasNext() && i2.hasNext();
            }

            @Override
            public T next() {
                nextFirst = !nextFirst;
                return nextFirst ? i1.next() : i2.next();
            }
        };

        return StreamSupport.stream(iterable.spliterator(), false);
    }
}
