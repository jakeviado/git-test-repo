package com.demo.oop.application;

public class Ellipse extends Circle{
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
