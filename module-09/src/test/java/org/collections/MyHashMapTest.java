package org.collections;

import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MyHashMapTest {
    private static MyHashMap<String, Integer> myHashMap;
    private static int firstRandom;
    private static int secondRandom;
    private static int thirdRandom;

    @BeforeAll
    public static void createQueueAndGenerateValues() {
        myHashMap = new MyHashMap<>();
        Random random = new Random();
        firstRandom = random.nextInt();
        secondRandom = random.nextInt();
        thirdRandom = random.nextInt();
    }

    @Test
    @Order(1)
    public void checkDefaultSize() {
        assertEquals(0, myHashMap.size());
    }

    @Test
    @Order(2)
    public void putElementToStack() {
        myHashMap.put(String.valueOf(firstRandom), firstRandom);
        myHashMap.put(String.valueOf(secondRandom), secondRandom);
        myHashMap.put(String.valueOf(thirdRandom), thirdRandom);
        assertEquals(3, myHashMap.size(), "Put method works incorrectly.");
    }

    @Test
    @Order(3)
    public void checkGet() {
        assertEquals(thirdRandom, myHashMap.get(String.valueOf(thirdRandom)), "Get method works incorrectly.");
    }

    @Test
    @Order(4)
    public void checkRemove() {
        assertEquals(thirdRandom, myHashMap.remove(String.valueOf(thirdRandom)), "Method remove works incorrectly");
    }

    @Test
    @Order(5)
    public void checkClear() {
        myHashMap.clear();
        assertEquals(0, myHashMap.size(), "Method clear works incorrectly");
    }
}
