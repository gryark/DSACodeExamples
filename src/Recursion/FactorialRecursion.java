package Recursion;

public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException(); // argument must be nonnegative
        else if (n == 0)
            return 1; // base case
        else
            return n * factorial(n - 1); // recursive case
    }
}
