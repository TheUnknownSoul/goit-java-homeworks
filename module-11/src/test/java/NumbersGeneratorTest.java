import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.streams.task4.NumbersGenerator.getLinearCongruentOscillator;

public class NumbersGeneratorTest {

    @Test
    void testGetLinearCongruentGenerator() {
        long a = 25214903917L;
        long c = 11L;
        long m = 281474976710656L;

        Long[] expected = {0L, 11L, 277363943098L, 11718085204285L, 49720483695876L, 102626409374399L,
                25707281917278L, 25979478236433L, 137139456763464L, 148267022728371L};

        assertArrayEquals(expected, getLinearCongruentOscillator(a, c, m).limit(10).toArray());
    }
}
