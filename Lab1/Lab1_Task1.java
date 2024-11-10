
package javaapplication23;

public class JavaApplication23 {


    public static void main(String[] args) {
        String str1 = "Arham";
        String str2 = "Shakeel";
        
        // New keyword
        String str3 = new String("BS");
        String str4 = new String("Software");
        
        // Using intern method
        String str5 = str3.intern();
        
        // Check immutability
        str3.concat("Shahid");
        // Print the strings
        System.out.println("String 1: " + str1);            
        System.out.println("String 2: " + str2);    
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
        System.out.println("String5 (interned): " + str5);
    }
    
}
