package org.shapes.test;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.printer.ShapePrinter;
import org.shape.*;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class OvalShapeTest {
    private final PrintStream standardOut = System.out;

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private static Shape oval;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @BeforeEach
    public void createOval() {
        oval = new Oval();
    }

    @Test
    public void checkDefaultOvalName() {
        assertEquals("Oval", oval.getShapeName());
    }

    @Test
    public void checkShapesNamePrinter() {
        ShapePrinter.printShapeName(oval);
        assertEquals("Shape name: Oval" + "\n", outputStreamCaptor.toString());
    }

}
