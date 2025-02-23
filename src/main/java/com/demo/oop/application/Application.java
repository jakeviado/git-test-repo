package com.demo.oop.application;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select: ");
        System.out.println("1. Circle ");
        System.out.println("2: Ellipse ");

        int choice = sc.nextInt();;
        switch (choice) {
            case 1:
                System.out.println("Circle");
                Circle circle = new Circle();

                circle.getCircumference();
                circle.getArea();

                break;

            case 2:
                System.out.println("\n" + "Ellipse");

                Ellipse ellipse = new Ellipse();

                ellipse.getCircumference();
                ellipse.getArea();

                break;
            default:
                System.out.println("error");
        }
    }
}
