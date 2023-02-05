import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.streams.task3.SortedArrayNumbers;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortedArrayNumbersTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void checkArrayNumbersSortingTestCase_1() {
        String[] input = {"1, 2, 3, 4, 33", "5, 44, 3, 2", "65, 87", "0"};
        SortedArrayNumbers.printSortedNumbersFromArray(input);
        assertEquals("0, 1, 2, 3, 4, 5, 33, 44, 65, 87" + "\n", outputStreamCaptor.toString());
    }
}
