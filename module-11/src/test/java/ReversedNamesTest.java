import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.streams.task2.ReversedNames;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversedNamesTest {

    private static List<String> names;

    @BeforeAll
    public static void createAndFillNameList() {
        names = new ArrayList<>();
        Faker nameGenerator = new Faker();
        for (int i = 1; i <= 10; i++) {
            names.add(nameGenerator.name().firstName());
        }
    }

    @Test
    public void checkOddNames() {
        List<String> expectedResult = names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        List<String> actualResult = ReversedNames.getReversedSortedStringsInUppercase(names);
        assertEquals(expectedResult, actualResult);
    }
}
