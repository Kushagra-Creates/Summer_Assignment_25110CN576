import java.util.ArrayList;
import java.util.Scanner;
//Helper class to make a student with bunch of it's objects
class Student { 
    int id;
    String name;
    String department;

    // Constructor to initialize student details
    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    // Helper method to neatly print student details
    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Dept: " + department);
    }
}
public class Question105 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> record = new ArrayList<>(); //Making an Dynamic Array (Arraylist) with student class 
         while (true) {
            System.out.println("\ns--- Student Management System ---");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display All Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            if (choice == 1) {
                System.out.print("Enter Student ID: ");
                int id = in.nextInt();
                in.nextLine(); // Consume newline character after the input
                System.out.print("Enter Student Name: ");
                String name = in.nextLine();
                System.out.print("Enter Department: ");
                String dept = in.nextLine();
                // Add the new Student object straight into our array list
                record.add(new Student(id, name, dept));
                System.out.println("Record added successfully!");
            } else if (choice == 2) {
                System.out.println("\n--- Registered Student Database ---");
                if (record.isEmpty()) {
                    System.out.println("No records found.");
                } else {
                    for (Student s : record) {
                        s.display();
                    }
                }
            } else if (choice == 3) {
                System.out.println("Exiting System. Goodbye!");
                break;
            } else {
                System.out.println("Invalid Choice!");
            }
        }
        in.close();
    }
}