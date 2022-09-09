package Lab2;

import java.util.Arrays;

public class ArraySumOfEvenOdd {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 1, 2, 5, 10};

        System.out.println(Arrays.toString(arr));
        System.out.println("Evens Sum = "+evenSum(arr));
        System.out.println("Odds Sum = "+oddSum(arr));
    }

    static int evenSum(int[] arr) {
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        return sum;
    }

    static int oddSum(int[] arr) {
        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        return sum;
    }
}
