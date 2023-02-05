package org.shapes.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.printer.ShapePrinter;
import org.shape.Shape;
import org.shape.Square;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareShapeTest {
    private static Shape square;
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
    public void createSquare() {
        square = new Square();
    }

    @Test
    public void checkDefaultSquareName() {
        assertEquals("Square", square.getShapeName());
    }

    @Test
    public void checkShapesNamePrinter() {
        ShapePrinter.printShapeName(square);
        assertEquals("Shape name: Square" + "\n", outputStreamCaptor.toString());

    }
}
