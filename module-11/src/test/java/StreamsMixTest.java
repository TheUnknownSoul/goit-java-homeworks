import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.streams.task5.StreamsMix.zip;

public class StreamsMixTest {

    @Test
    public void testZip() {

        Stream<Integer> stream1 = Stream.of(1, 3);
        Stream<Integer> stream2 = Stream.of(2, 4, 6);

        Integer[] expected = {1, 2, 3};
        Object[] actual = zip(stream1, stream2).toArray();
        assertArrayEquals(expected, actual);
    }
}
