import java.util.ArrayList;
import java.util.Scanner;
//Creating a helper class Employee 
class Employee {
    int empId;
    String name;
    String designation;
    public Employee(int empId, String name, String designation) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
    }
    public void display() {
        System.out.println("ID: " + empId + " | Name: " + name + " | Role: " + designation);
    }
}
public class Question106 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<>(); //Creating an Arraylist with employee as datatype
        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = in.nextInt();
            if (choice == 1) {
                System.out.print("Enter Employee ID: ");
                int id = in.nextInt();
                in.nextLine();
                System.out.print("Enter Name: ");
                String name = in.nextLine();
                System.out.print("Enter Designation: ");
                String desig = in.nextLine();
                empList.add(new Employee(id, name, desig));
                System.out.println("Employee added successfully!");
            } else if (choice == 2) {
                System.out.println("\n--- Employee Roster ---");
                if (empList.isEmpty()) System.out.println("Roster is empty.");
                for (Employee e : empList) e.display();
            } else if (choice == 3) {
                System.out.print("Enter Employee ID to search: ");
                int searchId = in.nextInt();
                boolean found = false;
                for (Employee e : empList) {
                    if (e.empId == searchId) {
                        System.out.print("Match Found -> ");
                        e.display();
                        found = true;
                        break;
                    }
                }
                if (!found) System.out.println("Employee with ID " + searchId + " not found.");
            } else if (choice == 4) {
                System.out.println("Terminating Dashboard application.");
                break;
            } else {
                System.out.println("Invalid entry.");
            }
        }
        in.close();
    }
}