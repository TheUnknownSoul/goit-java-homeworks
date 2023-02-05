import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.streams.task1.NamesSort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class NamesSortTest {

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
        String expectedResult = IntStream.range(0, names.size())
                .filter(value -> value % 2 != 0)
                .mapToObj(i -> String.format("%d. %s", i, names.get(i)))
                .collect(Collectors.joining(", "));

        String actualResult = NamesSort.getNamesWithOddIndex(names);
        assertEquals(expectedResult, actualResult);
    }
}
