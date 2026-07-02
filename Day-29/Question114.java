import java.util.Scanner;
public class Question114 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Define a maximum capacity for the array
        int[] arr = new int[100];
        int elements = 0; // Tracks the actual number of elements currently stored
        System.out.println("--- Array Operations Management System ---");
        while (true) {
            System.out.println("\n*** CHOOSE AN OPERATION ***");
            System.out.println("1. Insert Element at End");
            System.out.println("2. Delete Element by Value");
            System.out.println("3. Search for an Element");
            System.out.println("4. Display Array Content");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = in.nextInt();
            switch (choice) {
                case 1: // Insert elements at the end
                    if (elements >= arr.length) {
                        System.out.println("Error: Array is completely full!");
                    } else {
                        System.out.print("Enter the integer value to insert: ");
                        int val = in.nextInt();
                        arr[elements] = val; // Add to the next available slot
                        elements++;          // Expand our valid elements boundary
                        System.out.println("Successfully inserted " + val);
                    }
                    break;
                    
                case 2: // Delete the element by value
                    if (elements == 0) {
                        System.out.println("Array is empty! Nothing to delete.");
                    } else {
                        System.out.print("Enter the value to delete: ");
                        int target = in.nextInt();
                        int delIndex = -1;
                        
                        // Find the target value's index
                        for (int i = 0; i < elements; i++) {
                            if (arr[i] == target) {
                                delIndex = i;
                                break;
                            }
                        }
                        
                        if (delIndex == -1) {
                            System.out.println("Element not found in the array.");
                        } else {
                            // Shift all elements to the left to close the gap
                            for (int i = delIndex; i < elements - 1; i++) {
                                arr[i] = arr[i + 1];
                            }
                            elements--; // Shrink our valid elements boundary
                            System.out.println("Successfully deleted " + target);
                        }
                    }
                    break;
                    
                case 3: // Search for an element 
                    if (elements == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Enter value to search for: ");
                        int key = in.nextInt();
                        boolean found = false;
                        
                        for (int i = 0; i < elements; i++) {
                            if (arr[i] == key) {
                                System.out.println("Element found at Index position: " + i);
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Element not found in the array.");
                        }
                    }
                    break;
                    
                case 4: // Display the elements 
                    if (elements == 0) {
                        System.out.println("Array is currently empty: []");
                    } else {
                        System.out.print("Current Array elements: [ ");
                        for (int i = 0; i < elements; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println("]");
                    }
                    break;
                    
                case 5: // Exit out of the Program
                    System.out.println("Thank you for using the Array Operations System. Goodbye!");
                    in.close();
                    return; // Gracefully exits the entire program
                    
                default:
                    System.out.println("Invalid entry! Please pick a choice between 1 and 5.");
                    break;
            }
        }
    }
}