package org.collections;

import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MyLinkedListTest {
    private static MyLinkedList<String> linkedList;
    private static int firstRandom;
    private static int secondRandom;
    private static int thirdRandom;

    @BeforeAll
    public static void createQueueAndGenerateValues() {
        linkedList = new MyLinkedList<>();
        Random random = new Random();
        firstRandom = random.nextInt();
        secondRandom = random.nextInt();
        thirdRandom = random.nextInt();
    }

    @Test
    @Order(1)
    public void checkDefaultSize() {
        assertEquals(0, linkedList.size());
    }

    @Test
    @Order(2)
    public void addElementToList() {
        linkedList.add(String.valueOf(firstRandom));
        linkedList.add(String.valueOf(secondRandom));
        linkedList.add(String.valueOf(thirdRandom));
        assertEquals(3, linkedList.size(), "Add method works incorrectly.");
    }

    @Test
    @Order(3)
    public void checkGetElementByIndex() {
        assertEquals(String.valueOf(thirdRandom), linkedList.get(2), "Get element by index method works incorrectly.");
    }

    @Test
    @Order(4)
    public void checkRemove() {
        linkedList.remove(2);
        assertEquals(2, linkedList.size(), "Method remove works incorrectly");
        assertEquals(String.valueOf(linkedList.get(1)), String.valueOf(secondRandom), "Method remove works incorrectly");
    }

    @Test
    @Order(5)
    public void checkClear() {
        linkedList.clear();
        assertEquals(0, linkedList.size(), "Method clear works incorrectly");
    }
}
