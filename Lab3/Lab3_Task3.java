package javaapplication23;
import java.util.*;


public class JavaApplication23 {
    public static int sumToN(int n) {
        if (n == 0) {
            return 0;  // Base case: sum of 0 is 0
        }
        return n + sumToN(n - 1);  // Recursive case: add n and call with n-1
    }
     public static void main(String[] args) {
         System.out.println(sumToN(12));  // Example with N = 5
        
         
    }
}
