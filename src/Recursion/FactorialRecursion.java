package Recursion;

public class FactorialRecursion {
    public static void main(String[] args) {
       // System.out.println(factorialWithoutRecursion(5));
        System.out.println(factorialWithRecursion(5));
    }

    public static int factorialWithoutRecursion(int n){
        int result=1;
        for (int i=n; n>0; i--){ //5  * 4 *  3 * 2 * 1
            result = result * i;
        }
        return result;
    }
    public static int factorialWithRecursion(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException(); // argument must be nonnegative
        else if (n == 0)
            return 1; // base case
        else
            return n * factorialWithRecursion(n - 1); // recursive case
    }
}
