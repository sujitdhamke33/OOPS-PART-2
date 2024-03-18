package OOPS1.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.input();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double result = add(num1, num2);
        double result1 = sub(num1, num2);


        System.out.println("Result of addition: " + result);
        System.out.println("Result of substraction: " + result1);
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }
    public double sub(double num1, double num2) {
        return num1 - num2;
    }
}

