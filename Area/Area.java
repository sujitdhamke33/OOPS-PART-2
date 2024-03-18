package OOPS1.Area;

import java.util.Scanner;

public class Area {

        double area;

        public void calculateAreaRectangle(double length, double breadth) {
            area = length * breadth;
        }
        public void calculateAreaCircle(double radius) {
            area = 3.14 * radius * radius;
        }
        public void displayArea() {
            System.out.println("Area: " + area);
        }
}
