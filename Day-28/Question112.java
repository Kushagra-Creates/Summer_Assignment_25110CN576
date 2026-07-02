import java.util.ArrayList;
import java.util.Scanner;
public class Question112{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Two separate lists running in sync
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> phones = new ArrayList<>();
        boolean running = true; //Boolean variable to keep the loop running
        while (running) { 
            System.out.println("\n--- Contact Directory Dashboard ---");
            System.out.println("1. Add New Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Exit");
            System.out.print("Select an operation: ");
            int choice = in.nextInt();
            in.nextLine(); // Clear next line characcter 
            switch (choice) {
                case 1: //Case 1: To input a new contact and Phone number
                    System.out.print("Enter Contact Name: ");
                    String contactName = in.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = in.nextLine();

                    names.add(contactName);
                    phones.add(phoneNumber);
                    System.out.println("Contact for '" + contactName + "' saved successfully!");
                    break;
                case 2: //Case 2: Displaying the contact
                    System.out.println("\n--- My Saved Contacts ---");
                    if (names.isEmpty()) {
                        System.out.println("Address book is empty.");
                    } else {
                        for (int i = 0; i < names.size(); i++) {
                            System.out.println((i + 1) + ". Name: " + names.get(i) + " | Phone: " + phones.get(i));
                        }
                    }
                    break;
                case 3: //Case 3: Exit the program
                    System.out.println("Closing Address Book application.");
                    running = false; // Breaks out of the while loop execution chain
                    break;

                default:
                    System.out.println("Invalid option entry! Please enter 1, 2, or 3.");
                    break;
            }
        }
        in.close();
    }
}