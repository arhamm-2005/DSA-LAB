package javaapplication23;

public class JavaApplication23 {

    public static void main(String[] args) {
        String str = "hello world";
        System.out.println("Original String: " + str);
        System.out.println("String after reversing vowels: " + reverseVowels(str));
        
        String sentence = "Java programming is fun";
        System.out.println("Longest word: " + findLongestWord(sentence));
    }
    
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;
        String vowels = "aeiouAEIOU";
        
        while (left < right) {
            if (!vowels.contains(chars[left] + "")) {
                left++;
                continue;
            }
            if (!vowels.contains(chars[right] + "")) {
                right--;
                continue;
            }
            // Swap vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
        return new String(chars);
    }
    
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}
