package org.printer;

import org.shape.Shape;

public class ShapePrinter {
    public static void printShapeName(Shape shape){
        System.out.println("Shape name: " + shape.getShapeName());
    }
}
