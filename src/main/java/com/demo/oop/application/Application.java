package com.demo.oop.application;

public class Application {
    public static void main(String[] args) {

        System.out.println("Circle");
        Circle circle = new Circle();

        circle.getCircumference();
        circle.getArea();


        System.out.println("\n" + "Ellipse");

        Ellipse ellipse = new Ellipse();

        ellipse.getCircumference();
        ellipse.getArea();
    }
}
