package org.collections;

import org.junit.jupiter.api.*;

import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MyStackTest {
    private static MyStack<Integer> stack;
    private static int firstRandom;
    private static int secondRandom;
    private static int thirdRandom;

    @BeforeAll
    public static void createQueueAndGenerateValues() {
        stack = new MyStack<>();
        Random random = new Random();
        firstRandom = random.nextInt();
        secondRandom = random.nextInt();
        thirdRandom = random.nextInt();
    }

    @Test
    @Order(1)
    public void checkDefaultSize() {
        assertEquals(0, stack.size());
    }

    @Test
    @Order(2)
    public void pushElementToStack() {
        stack.push(firstRandom);
        stack.push(secondRandom);
        stack.push(thirdRandom);
        assertEquals(3, stack.size(), "Push method works incorrectly.");
    }

    @Test
    @Order(3)
    public void checkPeek() {
        assertEquals(thirdRandom, stack.peek(), "Peek method works incorrectly.");
    }

    @Test
    @Order(4)
    public void checkPop() {
        assertEquals(thirdRandom, stack.pop(), "Method pop works incorrectly");
    }

    @Test
    @Order(5)
    public void checkClear() {
        stack.clear();
        assertEquals(0, stack.size(), "Method clear works incorrectly");
    }
}
