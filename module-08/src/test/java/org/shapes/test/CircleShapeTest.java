package org.shapes.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.printer.ShapePrinter;
import org.shape.Circle;
import org.shape.Shape;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CircleShapeTest {
    private static Shape circle;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @BeforeEach
    public void createCircle() {
        circle = new Circle();
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void checkDefaultCircleName() {
        assertEquals("Circle", circle.getShapeName());
    }

    @Test
    public void checkDefaultShapeColor() {
        int[] defaultWhiteColorSchema = {0, 0, 0};
        assertArrayEquals(defaultWhiteColorSchema, circle.getShapeColorSchema());
    }

    @Test
    public void checkCircleShapeNamePrinter() {
        ShapePrinter.printShapeName(circle);
        assertEquals("Shape name: Circle", outputStreamCaptor.toString().trim());
    }
}
