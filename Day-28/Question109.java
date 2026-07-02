import java.util.ArrayList;
import java.util.Scanner;

public class Question109 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Simple list to store book titles
        ArrayList<String> bookList = new ArrayList<>();
        while (true) { //Using a while loop to keep running until the operation is done 
            System.out.println("\n--- Library Management Menu ---");
            System.out.println("1. Add a New Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = in.nextInt();
            in.nextLine(); // Consume trailing newline character
            //Using If Else statement (we can also use switch)
            if (choice == 1) { //case 1: To add a new book
                System.out.print("Enter Book Title: ");
                String bookTitle = in.nextLine();
                bookList.add(bookTitle);
                System.out.println( bookTitle + "' added to the library!");
            } 
            else if (choice == 2) { //Case 2: To display all the books
                System.out.println("\n--- Library Catalog ---");
                if (bookList.isEmpty()) {
                    System.out.println("The library is currently empty.");
                } else {
                    for (int i = 0; i < bookList.size(); i++) {
                        System.out.println((i + 1) + ". " + bookList.get(i));
                    }
                }
            } 
            else if (choice == 3) { //Case 3: To exit the loop 
                System.out.println("Exiting Library Dashboard.");
                break;
            } 
            else { //Default Case:
                System.out.println("Invalid option! Try again.");
            }
        }
        in.close();
    }
}