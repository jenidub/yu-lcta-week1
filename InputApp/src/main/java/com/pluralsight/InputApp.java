package com.pluralsight;
import java.util.*;

public class InputApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("What do you want to do? Enter [1] Add or [2] Subtract  =>  ");
        int command = scanner.nextInt();

        if (command == 1) {
            doAdd();
        } else if (command == 2) {
            doSubtract();
        } else {
            System.out.printf("%d -- Invalid command - please run again", command);
        }
    }

    public static void doAdd() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        System.out.printf("%.2f + %.2f = %.2f", num1, num2, sum);
    }

    public static void doSubtract() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter 2nd number: ");
        double num2 = scanner.nextDouble();

        double difference = num1 - num2;
        System.out.printf("%.2f - %.2f = %.2f", num1, num2, difference);
    }
}

