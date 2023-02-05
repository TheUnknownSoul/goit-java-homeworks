package org.shape;


public class Circle extends Shape {

    /**
     * Default constructor without parameters. Initializes parent constructor and sets
     * basic name for this type of figures.
     */
    public Circle() {
        super();
        setShapeName("Circle");
    }

    public Circle(String shapeName, String color) {
        super(shapeName, color);
    }

    public Circle(String shapeName, int redColor, int greenColor, int blueColor) {
        super(shapeName, redColor, greenColor, blueColor);
    }

    public Circle(Shape shape) {
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
    public String getShapeColor() {
        return super.getShapeColor();
    }

    @Override
    public String getShapeName() {
        return super.getShapeName();
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

}
