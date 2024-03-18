package OOPS1.methodOverloading;

import java.util.Scanner;

public class MethodOverloading {

    public static int calculateArea(int side) {
        return side * side;
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side length of square:");
        double side = scanner.nextDouble();
        System.out.println("Area of square: " + calculateArea(side));

        System.out.println("Enter length and width of rectangle:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Area of rectangle: " + calculateArea(length, width));

        System.out.println("Enter radius of circle:");
        double radius = scanner.nextDouble();
        System.out.println("Area of circle: " + calculateArea(radius));

    }
}
