package javaapplication23;
import java.util.*;

public class JavaApplication23 {

    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 9, 12, 15};
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }

    
}
