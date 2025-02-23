package com.demo.oop.application;

public class Ellipse extends Circle{

    /**
     * * This is a model for Ellipse that extends Circle class
     * *
     * * @param a - Represents a constant value length of the semi-major axis (half of the longest diameter).
     * * @param b - Represents a constant value length of the semi-minor axis (half of the shortest diameter) of the ellipse.
     * * @return - Returns the calculated value of perimeter/circumference and area of an ellipse
     * */

    private final double a = 5;
    private final double b = 4;

    public Ellipse() {
    }

    @Override
    public void getArea() {
        double ellipseArea = getPi() * a * b;

        System.out.println("Ellipse area " + ellipseArea);
    }

    @Override
    public void getCircumference() {
        double perimeter;
        perimeter = (double)2 * getPi() * Math.sqrt((a * a + b * b) / (2 * 1.0)) ;

        System.out.println("Perimeter: " + perimeter);
    }
}
