package OOPS1.ByteSum;

import java.util.Scanner;

public class ByteSum {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first byte value:");
            byte byte1 = scanner.nextByte();
            System.out.println("Enter the second byte value:");
            byte byte2 = scanner.nextByte();

            double sum = (double) byte1 + (double) byte2;

            System.out.println("Sum of " + byte1 + " and " + byte2 + " is: " + sum);
        }
    }

