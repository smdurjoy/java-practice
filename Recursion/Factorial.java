package Recursion;

public class Factorial {
    public static void main(String args[]) {
        int n = 5;
        System.out.println(calculateFactorial(n));
    }

    public static int calculateFactorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }

        int factorial_of_n_minus_1 = calculateFactorial(n-1);
        int factorial_of_n = factorial_of_n_minus_1 * n;
        return factorial_of_n;
    }
}