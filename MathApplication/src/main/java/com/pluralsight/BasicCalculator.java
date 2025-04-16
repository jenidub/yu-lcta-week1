package com.pluralsight;
import java.util.*;


public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Available Calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtraction");
        System.out.println("(M)ultiplication");
        System.out.println("(D)ivision");

        System.out.println("Please select an option: ");
        String selection = scanner.nextLine();

        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);

    }

}
