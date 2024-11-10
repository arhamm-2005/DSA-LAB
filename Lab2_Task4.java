package javaapplication23;
import java.util.*;

public class JavaApplication23 {
     public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(Arrays.asList(5, 3, 8, 1, 7, 4, 9, 2, 6, 10));
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int max = Collections.max(numbers);

        System.out.println("Integers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Max Element: " + max);
         
    }
}
