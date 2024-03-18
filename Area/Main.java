package OOPS1.Area;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length and breadth of the rectangle:");
        double lengthRectangle = scanner.nextDouble();
        double breadthRectangle = scanner.nextDouble();

        System.out.println("Enter base and radius of the Circle:");
        double radius = scanner.nextDouble();

        Area rectangle = new Area();
        Area circle = new Area();

        rectangle.calculateAreaRectangle(lengthRectangle, breadthRectangle);

        circle.calculateAreaCircle( radius);

        System.out.println("Area of Rectangle:");
        rectangle.displayArea();

        System.out.println("Area of Triangle:");
        circle.displayArea();
    }
}
