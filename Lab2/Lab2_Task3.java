package javaapplication23;
import java.util.*;

class Employee {
    int empId;
    String empName;
    int joiningYear;

    public Employee(int empId, String empName, int joiningYear) {
        this.empId = empId;
        this.empName = empName;
        this.joiningYear = joiningYear;
    }

    @Override
    public String toString() {
        return empName + " (" + joiningYear + ")";
    }
}
public class JavaApplication23 {
     public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ali", 2000));
        employees.add(new Employee(2, "Arham", 2005));
        employees.add(new Employee(3, "Urooj", 1995));

        // Sort by joining year
        employees.sort(Comparator.comparingInt(e -> e.joiningYear));

        System.out.println("Employees sorted by joining year: \n"+ employees);
         
    }
}
