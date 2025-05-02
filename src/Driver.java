/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: A Driver class that creates a RationalNumber object with the
 *              numerator and denominator entered by the user and prints the GCD.
 */

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter positive integer as numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter positive integer as denominator: ");
        int denominator = scanner.nextInt();

        // Create RationalNumber object
        RationalNumber rnum = new RationalNumber(numerator, denominator);
        // Compute GCD
        int gcd = rnum.getGCD();
        
        System.out.println("Greatest common denominator of " + rnum + " is " + gcd);
    }
}
