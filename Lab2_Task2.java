package javaapplication23;
import java.util.*;

public class JavaApplication23 {

    public static void main(String[] args) {
         ArrayList<String> strings = new ArrayList<>();
        strings.add("Isco");
        strings.add("Messi");
        strings.add("Ronaldo");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Display all elements");
            System.out.println("2. Display largest string");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Elements: " + strings);
            } else if (choice == 2) {
                String largest = Collections.max(strings, Comparator.comparing(String::length));
                System.out.println("Largest String: " + largest);
            } else if (choice == 3) {
                break;
            }
        }
    }
}
