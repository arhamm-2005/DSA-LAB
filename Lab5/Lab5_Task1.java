package javaapplication23;
import java.util.*;

public class JavaApplication23 {

    public static void main(String[] args) {
       int[] arr = {19, 30, 9, 20, 24, 11, 23}; 
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            // Find the minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            // Print the array after each iteration
            System.out.print("Iteration " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
