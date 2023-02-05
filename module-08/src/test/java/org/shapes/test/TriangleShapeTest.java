package org.shapes.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.printer.ShapePrinter;
import org.shape.Shape;
import org.shape.Triangle;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleShapeTest {
    private static Shape triangle;
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

    @BeforeEach
    public void createTriangle() {
        triangle = new Triangle();
    }

    @Test
    public void checkDefaultTriangleName() {
        assertEquals("Triangle", triangle.getShapeName());
    }

    @Test
    public void checkTriangleShapeNamePrinter() {
        ShapePrinter.printShapeName(triangle);
        assertEquals("Shape name: Triangle" + "\n", outputStreamCaptor.toString());
    }
}
