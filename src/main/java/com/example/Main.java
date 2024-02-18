package com.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    static double naturalLog(double x) {
        if (x <= 0) {
            System.out.println("Natural Logarithm is not defined for non-positive numbers.");
            return Double.NaN;
        } else {
            return Math.log(x);
        }
    }

    static double exponent(double x, double exponent) {
        return Math.pow(x, exponent);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double operand;

        do {
            // Display menu
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power (x^y)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the operand: ");
                    operand = scanner.nextDouble();
                    System.out.println(squareRoot(operand));
                    break;

                case 2:
                    System.out.print("Enter the operand: ");
                    operand = scanner.nextDouble();
                    if (operand < 0) {
                        System.out.println("Factorial is not defined for negative numbers.");
                    } else {
                        System.out.println("Factorial of " + (int) operand + " is: " + factorial((int) operand));
                    }
                    break;

                case 3:
                    System.out.print("Enter the operand: ");
                    operand = scanner.nextDouble();
                    System.out.println(naturalLog(operand));
                    break;

                case 4:
                    double exponent;
                    System.out.print("Enter the base: ");
                    operand = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    exponent = scanner.nextDouble();
                    System.out.println(operand + " raised to the power " + exponent + " is: " + exponent(operand, exponent));
                    break;

                case 0:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }
}