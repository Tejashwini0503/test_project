package programs_day2;

import java.util.Scanner;

public class LastDigitSum {

    // Method to add the last digits of two integers
    public static int addLastDigits(int input1, int input2) {
        // Ignore the sign using Math.abs
        int lastDigit1 = Math.abs(input1) % 10;
        int lastDigit2 = Math.abs(input2) % 10;

        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Call the method and print result
        int result = addLastDigits(num1, num2);
        System.out.println("Sum of last digits: " + result);

        scanner.close();
    }
}
