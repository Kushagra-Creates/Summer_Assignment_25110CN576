import java.util.HashMap;
import java.util.Scanner;
public class Question116 {
    public static void main(String[] args) {
        // HashMap to store Product ID (Key) and Product Name (Value)
        HashMap<Integer, String> inventory = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("=== Inventory System Menu ===");
        boolean keepRunning = true;
        // Using a while loop to control the system execution
        while (keepRunning) {
            System.out.println("\n**** MENU ****");
            System.out.println("1. Add/Update Item");
            System.out.println("2. Display All Items");
            System.out.println("3. Search Item by ID");
            System.out.println("4. Remove Item");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");
            int choice = in.nextInt();
            switch (choice) {
                case 1: //case 1: to add or update items stocck in the inventory
                    System.out.print("Enter Product ID: ");
                    int id = in.nextInt();
                    in.nextLine(); // Clear input newline character 
                    System.out.print("Enter Product Name: ");
                    String name = in.nextLine();
                    
                    // .put() adds if new product, or overrides existing value if the ID matches
                    inventory.put(id, name);
                    System.out.println("Inventory updated successfully!");
                    break;

                case 2: //Case 2: to display all the items currently in the stack
                    if (inventory.isEmpty()) {
                        System.out.println("The inventory is empty.");
                    } else {
                        System.out.println("\n**** Current Inventory List ****");
                        // Iterating through the HashMap keys and values smoothly
                        for (int key : inventory.keySet()) {
                            System.out.println("ID: " + key + " | Product Name: " + inventory.get(key));
                        }
                    }
                    break;

                case 3: //Case3: to search an item by it's Id in the inventory
                    System.out.print("Enter Product ID to search: ");
                    int searchId = in.nextInt();
                    
                    // Instantly check if the key exists without looping
                    if (inventory.containsKey(searchId)) {
                        System.out.println("Found => Product Name: " + inventory.get(searchId));
                    } else {
                        System.out.println("Product ID not found.");
                    }
                    break;

                case 4: //Case 4: To remove an item from the inventory
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = in.nextInt();
                    
                    if (inventory.containsKey(removeId)) {
                        inventory.remove(removeId);
                        System.out.println("Product removed successfully.");
                    } else {
                        System.out.println("Product ID not found.");
                    }
                    break;

                case 5: //Case 5: to exit out of the loop/program
                    System.out.println("Exiting System. Thank you!");
                    keepRunning = false; // Changes the while loop condition to break out of the program
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1-5.");
            }
        }
        
        in.close();
    }
}