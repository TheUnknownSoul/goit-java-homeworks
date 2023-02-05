package task3;

import org.io.task3.WordCounter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordCounterTest {
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
    public void findTheCommonWord() {
        WordCounter.countWords();
        String word = "the=4";
        boolean isCommon = Pattern.compile(word).matcher(outputStreamCaptor.toString()).find();
        assertTrue(isCommon);
    }
}
