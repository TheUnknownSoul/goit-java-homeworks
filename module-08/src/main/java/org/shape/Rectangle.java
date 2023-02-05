package org.shape;


import java.util.Objects;

public class Rectangle extends Shape {

    /**
     * Default constructor without parameters. Initializes parent constructor and sets
     * basic name for this type of figures.
     */
    public Rectangle() {
        super();
        setShapeName("Rectangle");
    }

    public Rectangle(Shape shape) {
        super(shape);
    }

    public Rectangle(String shapeName, String color) {
        super(shapeName, color);
    }

    public Rectangle(String shapeName, int redColor, int greenColor, int blueColor) {
        super(shapeName, redColor, greenColor, blueColor);
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
        return new Rectangle(this);
    }
}
