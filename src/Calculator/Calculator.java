package Calculator;

/**
 * The Calculator class provides basic mathematical operations.
 */
public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param n1 the first number
     * @param n2 the second number
     * @return the sum of the two numbers
     */
    public double add(double n1, double n2) {
        return n1 + n2;
    }

    /**
     * Subtracts two numbers.
     *
     * @param n1 the first number
     * @param n2 the second number
     * @return the difference between the two numbers
     */
    public double subtract(double n1, double n2) {
        boolean isN1BelowZero = n1 < 0;
        boolean isN2BelowZero = n2 < 0;
        boolean isBothBelowZero = (n1 < 0 && n2 < 0);

        if (isBothBelowZero) {
            throw new IllegalArgumentException("Sorry, I cannot let you subtract two negative numbers");
        }
        return n1 - n2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param n1 the first number
     * @param n2 the second number
     * @return the product of the two numbers
     */
    public double multiply(double n1, double n2) {
        return 0;
    }

    /**
     * Divides two numbers.
     *
     * @param n1 the numerator
     * @param n2 the denominator
     * @return the result of the division
     */
    public double divide(double n1, double n2) {
        return 0;
    }

    /**
     * Calculates the power of a number.
     *
     * @param n1 the base
     * @param n2 the exponent
     * @return the result of raising n1 to the power of n2
     */
    public double powerOf(double n1, double n2) {
        return 0;
    }

    /**
     * Calculates the nth root of a number.
     *
     * @param n1 the radicand
     * @param n2 the index of the root
     * @return the result of taking the nth root of n1
     */
    public double rootOf(double n1, double n2) {
        return 0;
    }
}
