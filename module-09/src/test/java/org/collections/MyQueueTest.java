package org.collections;

import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MyQueueTest {

    private static MyQueue<Integer> queue;
    private static int firstRandom;
    private static int secondRandom;
    private static int thirdRandom;

    @BeforeAll
    public static void createQueueAndGenerateValues(){
        queue = new MyQueue<>();
        Random random = new Random();
        firstRandom = random.nextInt();
        secondRandom = random.nextInt();
        thirdRandom = random.nextInt();
    }

    @Test
    @Order(1)
    public void checkDefaultSize(){
        assertEquals(0, queue.size());
    }

    @Test
    @Order(2)
    public void addElementToQueue(){
        queue.add(firstRandom);
        queue.add(secondRandom);
        queue.add(thirdRandom);
        assertEquals(3, queue.size(), "Add method works incorrectly.");
    }

    @Test
    @Order(3)
    public void checkPeek(){
        assertEquals(firstRandom, queue.peek(), "Peek method works incorrectly.");
    }

    @Test
    @Order(4)
    public void checkPoll(){
        assertEquals(firstRandom, queue.poll(), "Method poll works incorrectly");
    }

    @Test
    @Order(5)
    public void checkClear(){
        queue.clear();
        assertEquals(0, queue.size(), "Method clear works incorrectly");
    }
}
