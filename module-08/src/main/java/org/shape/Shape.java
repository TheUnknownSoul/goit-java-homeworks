package org.shape;

import org.behavior.Movable;

import java.util.Objects;

/**
 * Realises Prototype pattern.
 * @link <a href="https://refactoring.guru/uk/design-patterns/prototype">More about prototype pattern</a>
 */
public abstract class Shape implements Movable {
    /**
     * Default values for new objects. All objects create with black color and current general object
     * name like Rectangle, Triangle etc.
     */
    private int redColor = 0;
    private int greenColor = 0;
    private int blueColor = 0;
    private double size = 0.0;
    private String color;
    private String shapeName;

    /**
     * Default constructor without parameters with general shape name - Shape.
     */
    public Shape() {
        shapeName = "Shape";
    }

    /**
     * Constructor for copying object. Create new object with the same type and same values.
     *
     * @param shape represents target object for cloning values.
     */
    public Shape(Shape shape) {
        if (shape != null) {
            this.shapeName = shape.shapeName;
            this.color = shape.color;
            this.redColor = shape.redColor;
            this.greenColor = shape.greenColor;
            this.blueColor = shape.blueColor;
            this.size = shape.size;
        }
    }

    /**
     * Alternative constructor for setting up color in string data format.
     *
     * @param color     string representation of color name.
     * @param shapeName identifier of shape name.
     */
    public Shape(String shapeName, String color) {
        this.shapeName = shapeName;
        this.color = color;
    }

    /**
     * Constructor with rgb color schema.
     *
     * @param shapeName  identifier of shape name.
     * @param redColor   represents red color.
     * @param greenColor represents green color.
     * @param blueColor  represents blue color.
     */
    public Shape(String shapeName, int redColor, int greenColor, int blueColor) {
        this.shapeName = shapeName;
        this.redColor = redColor;
        this.greenColor = greenColor;
        this.blueColor = blueColor;
    }

    /**
     * Sets color schema for shape.
     */
    public void setShapeColorSchema(int red, int green, int blue) {
        this.redColor = red;
        this.greenColor = green;
        this.blueColor = blue;
    }

    /**
     * Uses integer values for setting up color schemes such as rgb.
     *
     * @return values which represents values as red, green and blue colors.
     */
    public int[] getShapeColorSchema() {
        return new int[]{this.getRedColor(), this.getGreenColor(), this.getBlueColor()};
    }

    /**
     * Setup color as string.
     *
     * @return color format as string data type.
     */
    public String getShapeColor() {
        return this.color;
    }

    /**
     * For graphic applications it's necessary to name shapes or sets id.
     */
    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return this.shapeName;
    }

    /**
     * Allow to clone objects without implementing Cloneable interface.
     *
     * @return basic type of all figures.
     */
    public abstract Shape clone();

    // getters and setters for values.
    public int getRedColor() {
        return redColor;
    }

    public void setRedColor(int redColor) {
        this.redColor = redColor;
    }

    public int getGreenColor() {
        return greenColor;
    }

    public void setGreenColor(int greenColor) {
        this.greenColor = greenColor;
    }

    public int getBlueColor() {
        return blueColor;
    }

    public void setBlueColor(int blueColor) {
        this.blueColor = blueColor;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return redColor == shape.redColor && greenColor == shape.greenColor && blueColor == shape.blueColor &&
                Double.compare(shape.size, size) == 0 && color.equals(shape.color) && shapeName.equals(shape.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redColor, greenColor, blueColor, size, color, shapeName);
    }
}
