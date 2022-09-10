package Sorting;

// time complexity = O(n^2)
public class SelectionSort {
    public static void main(String args[]) {
        int arr[] = {9, 2, 4, 7, 6, 2};
        sort(arr);
    }

    public static void sort(int arr[]) {
        for (int i=0; i<arr.length-1; i++) {
            int smallest = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
