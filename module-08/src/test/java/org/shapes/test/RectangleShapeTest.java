package org.shapes.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.printer.ShapePrinter;
import org.shape.Rectangle;
import org.shape.Shape;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleShapeTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private static Shape rectangle;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @BeforeEach
    public void createRectangle() {
        rectangle = new Rectangle();
    }

    @Test
    public void checkDefaultRectangleName() {
        assertEquals("Rectangle", rectangle.getShapeName());
    }

    @Test
    public void checkRectangleShapesNamePrinter() {
        ShapePrinter.printShapeName(rectangle);
        assertEquals("Shape name: Rectangle" + "\n", outputStreamCaptor.toString());
    }


}
