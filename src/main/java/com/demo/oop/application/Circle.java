package com.demo.oop.application;

public class Circle {

    /**
     * * This is a model for Circle bla bla bla
     * *
     * * @param pi - Constant value of PI.
     * * @param radius - Constant value of a circle.
     * * @return - Returns value of PI, Radius, calculated value of circumference and area of a circle
     * */

    private final double pi = 3.14159;
    private final double radius = 15.337;

    public Circle() {
    }

    public void getCircumference() {
        double circumference = (2 * getPi() * getRadius());

        System.out.println("Radius " + radius);
        System.out.println("Circumference " + circumference);
    }

    public void getArea() {
        double area = (pi * (radius * 2));

        System.out.println("Area " + area);
    }

    public double getPi() {
        return pi;
    }

    public double getRadius() {
        return radius;
    }
}
