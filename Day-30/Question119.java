import java.util.HashMap;
import java.util.Scanner;
public class Question119 {
    public static void main(String[] args) {
        // HashMap to store Employee ID (Key) and Employee Name (Value)
        HashMap<Integer, String> employeeDB = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("=== Employee Management System ===");
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("\n**** EMPLOYEE MENU ****");
            System.out.println("1. Add / Update Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Remove Employee Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = in.nextInt();
            in.nextLine(); // Clear the input new line character
            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = in.nextInt();
                    in.nextLine(); // Clear input newline character again for the text input
                    System.out.print("Enter Employee Name: ");
                    String name = in.nextLine();
                    // .put() dynamically adds a new record or overwrites an existing one if the ID matches
                    employeeDB.put(id, name);
                    System.out.println("Success: Employee database updated.");
                    break;

                case 2:
                    if (employeeDB.isEmpty()) {
                        System.out.println("The employee database is currently empty.");
                    } else {
                        System.out.println("\n**** Employee Roster ****");
                        // Iterating efficiently through keys and fetching corresponding values
                        for (int key : employeeDB.keySet()) {
                            System.out.println("ID: " + key + " | Name: " + employeeDB.get(key));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = in.nextInt();
                    
                    // Instant key checking without iterating through a loop
                    if (employeeDB.containsKey(searchId)) {
                        System.out.println("Match Found -> Name: " + employeeDB.get(searchId));
                    } else {
                        System.out.println("Error: Employee ID not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to remove: ");
                    int removeId = in.nextInt();
                    
                    if (employeeDB.containsKey(removeId)) {
                        String removedEmployee = employeeDB.remove(removeId);
                        System.out.println("Success: Record for \"" + removedEmployee + "\" has been deleted.");
                    } else {
                        System.out.println("Error: Employee ID not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Employee System. Database session closed.");
                    keepRunning = false; // Breaks out of the while loop safely
                    break;

                default:
                    System.out.println("Invalid choice. Please select an option between 1 and 5.");
            }
        }

        in.close();
    }
}