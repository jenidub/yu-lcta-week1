package com.pluralsight;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // get two numbers, add them together, and display the sum
        System.out.print("Enter first number (integer required): ");
        int num1 = myScanner.nextInt();

        System.out.print("Enter second number (integer required): ");
        int num2 = myScanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is equal to " + sum);
    }

}
