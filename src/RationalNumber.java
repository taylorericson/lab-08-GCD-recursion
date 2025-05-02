/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: This class represents a rational number fraction with a numerator
 *              and a denominator. It computes the GCD using Euclid's algorithm.
 */

public class RationalNumber {
    private int numerator, denominator;

    public RationalNumber(int numer, int denom) {
    	// Check for divide by zero error
        if (denom == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }

        // Store negative sign in numerator and make denominator positive
        if (denom < 0) {
            numer = -numer;
            denom = -denom;
        }

        this.numerator = numer;
        this.denominator = denom;
    }

    // Recursive GCD method
    private int gcd(int a, int b) {
        if (b == 0)  // Base case
            return a;
        return gcd(b, a % b);  // Recursive call
    }

    // Getter
    public int getGCD() { return gcd(Math.abs(numerator), denominator); }

    // Return a formatted string representing the rational number
    public String toString() {
        return numerator + "/" + denominator;
    }
}


