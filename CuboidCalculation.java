package OOPS1;

import java.util.Scanner;

public class CuboidCalculation {

    public double calculatePerimeter(double length, double breadth, double height) {
        return 4 * (length + breadth + height);
    }

    public double calculateArea(double length, double breadth, double height) {

        double perimeter = calculatePerimeter(length, breadth, height);
        return 2 * ((length * breadth) + (breadth * height) + (height * length));
    }

    public double calculateVolume(double length, double breadth, double height) {

        double area = calculateArea(length, breadth, height);
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CuboidCalculation cuboidCalculation = new CuboidCalculation();

        System.out.println("Enter length, breadth, and height of the cuboid:");
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        double height = scanner.nextDouble();

        double volume = cuboidCalculation.calculateVolume(length, breadth, height);
        System.out.println("Volume of the cuboid: " + volume);

        scanner.close();
    }
}

