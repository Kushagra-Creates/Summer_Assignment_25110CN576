import java.util.Scanner;

public class Question117 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Define fixed-size arrays to store records
        int maxStudents = 50;
        int[] rollNumbers = new int[maxStudents];
        String[] studentNames = new String[maxStudents];
        // Tracker for how many students have actually been added
        int studentCount = 0;
        System.out.println("=== Student Record System ===");
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("\n**** MAIN MENU ****");
            System.out.println("1. Add Student Record");
            System.out.println("2. Display All Student Records");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    // Check if the array capacity has been reached
                    if (studentCount >= maxStudents) {
                        System.out.println("Error: Database full. Cannot add more students.");
                    } else {
                        System.out.print("Enter Roll Number: ");
                        int roll = in.nextInt();
                        in.nextLine(); // Clear the input buffer
                        System.out.print("Enter Student Name: ");
                        String name = in.nextLine();
                        // Store the information parallely in arrays at the current index
                        rollNumbers[studentCount] = roll;
                        studentNames[studentCount] = name;
                        studentCount++; // Increment count for the next student
                        System.out.println("Success: Student record added.");
                    }
                    break;

                case 2:
                    if (studentCount == 0) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("\n**** Current Student Directory ****");
                        // Loop strictly up to the current number of registered students
                        for (int i = 0; i < studentCount; i++) {
                            System.out.println("Roll No: " + rollNumbers[i] + " | Name: " + studentNames[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int searchRoll = in.nextInt();
                    boolean found = false;
                    
                    // Linear search through the active elements of the array
                    for (int i = 0; i < studentCount; i++) {
                        if (rollNumbers[i] == searchRoll) {
                            System.out.println("Match Found -> Name: " + studentNames[i]);
                            found = true;
                            break; // Exit loop early once found
                        }
                    }
                    
                    if (!found) {
                        System.out.println("Error: Student with Roll Number " + searchRoll + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Student System. Program closed.");
                    keepRunning = false; // Ends the while loop execution
                    break;

                default:
                    System.out.println("Invalid choice! Please select an option between 1 and 4.");
            }
        }
        
        in.close();
    }
}