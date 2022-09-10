package Sorting;

// time complexity = O(n^2)
public class InsertionSort {
    public static void main(String args[]) {
        int arr[] = {9, 2, 4, 7, 6, 2};
        sort(arr);
    }

    public static void sort(int arr[]) {
        for (int i=1; i<arr.length; i++) {
            int current = arr[i];
            int j = i-1;
           
            while (j >= 0 && current < arr[j]) {
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = current;
        }

        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
