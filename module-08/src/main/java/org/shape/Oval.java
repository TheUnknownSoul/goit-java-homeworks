package org.shape;

import java.util.Objects;

public class Oval extends Shape {

    /**
     * Default constructor without parameters. Initializes parent constructor and sets
     * basic name for this type of figures.
     */
    public Oval() {
        super();
        setShapeName("Oval");
    }

    public Oval(String shapeName, String color) {
        super(shapeName, color);
    }

    public Oval(String shapeName, int redColor, int greenColor, int blueColor) {
        super(shapeName, redColor, greenColor, blueColor);
    }

    public Oval(Shape shape) {
        super(shape);
    }

    @Override
    public void setShapeColorSchema(int red, int green, int blue) {
        super.setShapeColorSchema(red, green, blue);
    }

    @Override
    public int[] getShapeColorSchema() {
        return super.getShapeColorSchema();
    }

    @Override
    public Shape clone() {
        return new Oval(this);
    }

}
