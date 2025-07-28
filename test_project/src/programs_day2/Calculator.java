package programs_day2;

import java.util.Scanner;

public class Calculator {

    // Static method to calculate power for integers
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);  // Math.pow returns double, so cast to int
    }

    // Static method to calculate power for double and int
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);  // Directly returns double
    }

    // Main method to take user input and test the functionalities
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for powerInt method
        System.out.print("Enter an integer base: ");
        int intBase = scanner.nextInt();

        System.out.print("Enter an integer exponent: ");
        int intExponent = scanner.nextInt();

        int intResult = powerInt(intBase, intExponent);
        System.out.println(intBase + " raised to the power " + intExponent + " is: " + intResult);

        // Input for powerDouble method
        System.out.print("Enter a decimal (double) base: ");
        double doubleBase = scanner.nextDouble();

        System.out.print("Enter an integer exponent: ");
        int doubleExponent = scanner.nextInt();

        double doubleResult = powerDouble(doubleBase, doubleExponent);
        System.out.println(doubleBase + " raised to the power " + doubleExponent + " is: " + doubleResult);

        scanner.close();
    }
}
