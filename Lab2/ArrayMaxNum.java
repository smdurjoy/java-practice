package Lab2;
import java.util.Arrays;

public class ArrayMaxNum {
    public static void main(String[] args) {
        int[] arr = {11, 2, 6, 99, 2, 5, 10};
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum number for the above array is: "+maximum(arr));
    }

    public static int maximum(int[] arr) {
        int max = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
