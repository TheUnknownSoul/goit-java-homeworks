package org.shape;


public class Triangle extends Shape {

    /**
     * Default constructor without parameters. Initializes parent constructor and sets
     * basic name for this type of figures.
     */
    public Triangle() {
        super();
        setShapeName("Triangle");
    }

    public Triangle(String shapeName, String color) {
        super(shapeName, color);
    }

    public Triangle(String shapeName, int redColor, int greenColor, int blueColor) {
        super(shapeName, redColor, greenColor, blueColor);
    }

    public Triangle(Shape shape) {
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
        return new Triangle(this);
    }

}
