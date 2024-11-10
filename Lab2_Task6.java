package javaapplication23;
import java.util.*;

public class JavaApplication23 {
     public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        list1.addAll(list2);
        System.out.println("Merged List: " + list1);
         
    }
}
