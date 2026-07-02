import java.util.HashMap;
import java.util.Scanner;
public class Question118{
    public static void main(String[] args) {
        // HashMap to store Book ID (Key) and Book Title (Value)
        HashMap<String, String> library = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("=== Simplified Library System ===");
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("\n**** LIBRARY MENU ****");
            System.out.println("1. Add/Update Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book by ID");
            System.out.println("4. Remove Book from Catalogue");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");
            int choice = in.nextInt();
            in.nextLine(); // Clear the input newline character
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    String id = in.nextLine().toUpperCase();
                    System.out.print("Enter Book Title: ");
                    String title = in.nextLine();
                    // .put() adds a new pair or overwrites the title if the ID already exists
                    library.put(id, title);
                    System.out.println("Success: Library catalogue updated!");
                    break;
                case 2:
                    if (library.isEmpty()) {
                        System.out.println("The library is currently empty.");
                    } else {
                        System.out.println("\n**** Current Library Catalogue ****");
                        // Smoothly looping through keys and fetching values
                        for (String key : library.keySet()) {
                            System.out.println("Book ID: " + key + " | Title: " + library.get(key));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ID to search: ");
                    String searchId = in.nextLine().toUpperCase();
                    
                    // Instantly check using the key without iterating through a loop
                    if (library.containsKey(searchId)) {
                        System.out.println("Match Found => Title: " + library.get(searchId));
                    } else {
                        System.out.println("Error: Book ID not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Book ID to remove: ");
                    String removeId = in.nextLine().toUpperCase();
                    
                    if (library.containsKey(removeId)) {
                        String removedBook = library.remove(removeId);
                        System.out.println("Success: \"" + removedBook + "\" has been removed.");
                    } else {
                        System.out.println("Error: Book ID not found.");
                    }
                    break;
                case 5:
                    System.out.println("Closing Library System. Goodbye!");
                    keepRunning = false; // Breaks the while loop
                    break;

                default:
                    System.out.println("Invalid choice. Please select an option between 1 and 5.");
            }
        }
        in.close();
    }
}