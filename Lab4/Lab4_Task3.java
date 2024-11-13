package javaapplication23;
import java.util.*;

public class JavaApplication23 {

    public static void main(String[] args) {
        String[] words = {"level", "pencil", "deed", "rat"};
        
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}
