package Recursion;

public class Fibonacci {
    public static void main(String args[]) {
        int a=0, b=1, n=8;
        System.out.println(a);
        System.out.println(b);
        calculateFibo(a, b, n-2);
    }

    public static void calculateFibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }

        int c = a+b;
        System.out.println(c);
        calculateFibo(b, c, n-1);
    }
}