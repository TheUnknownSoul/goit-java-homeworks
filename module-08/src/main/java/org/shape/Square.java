package org.shape;


public class Square extends Shape {

    /**
     * Default constructor without parameters. Initializes parent constructor and sets
     * basic name for this type of figures.
     */
    public Square() {
        super();
        setShapeName("Square");
    }


    public Square(String shapeName, String color) {
        super(shapeName, color);
    }


    public Square(String shapeName, int redColor, int greenColor, int blueColor) {
        super(shapeName, redColor, greenColor, blueColor);
    }

    public Square(Shape shape) {
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
        return new Square(this);
    }

}
