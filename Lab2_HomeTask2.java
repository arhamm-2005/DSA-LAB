package javaapplication23;
import java.util.*;

public class JavaApplication23 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        
        // Display hash code
        System.out.println("HashCode of '" + input + "': " + input.hashCode());
         
    }
}
