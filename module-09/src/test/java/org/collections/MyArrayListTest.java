package org.collections;

import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MyArrayListTest {
    private static MyArrayList<String> arrayList;
    private static int firstRandom;
    private static int secondRandom;
    private static int thirdRandom;

    @BeforeAll
    public static void createQueueAndGenerateValues() {
        arrayList = new MyArrayList<>();
        Random random = new Random();
        firstRandom = random.nextInt();
        secondRandom = random.nextInt();
        thirdRandom = random.nextInt();
    }

    @Test
    @Order(1)
    public void checkDefaultSize() {
        assertEquals(0, arrayList.size());
    }

    @Test
    @Order(2)
    public void addElementToList() {
        arrayList.add(String.valueOf(firstRandom));
        arrayList.add(String.valueOf(secondRandom));
        arrayList.add(String.valueOf(thirdRandom));
        assertEquals(3, arrayList.size(), "Add method works incorrectly.");
    }

    @Test
    @Order(3)
    public void checkGetElementByIndex() {
        assertEquals(String.valueOf(thirdRandom), arrayList.get(2), "Get element by index method works incorrectly.");
    }

    @Test
    @Order(4)
    public void checkRemove() {
        arrayList.remove(2);
        assertEquals(2, arrayList.size(), "Method remove works incorrectly");
        assertEquals(String.valueOf(arrayList.get(1)), String.valueOf(secondRandom), "Method remove works incorrectly");
    }

    @Test
    @Order(5)
    public void checkClear() {
        arrayList.clear();
        assertEquals(0, arrayList.size(), "Method clear works incorrectly");
    }
}
