import java.util.Scanner;
public class Question115 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("=== Welcome to the String Operations System ===");
        do {
            System.out.println("\n**** MAIN MENU ****");
            System.out.println("1. Reverse a String");
            System.out.println("2. Check if Palindrome");
            System.out.println("3. Count Vowels and Consonants");
            System.out.println("4. Toggle Case (Upper <-> Lower)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = in.nextInt();
            in.nextLine(); // Consume newline left over
            switch (choice) {
                case 1: //Case 1: To reverse the string
                    System.out.print("Enter a string to reverse: ");
                    String str1 = in.nextLine();
                    String reversed = new StringBuilder(str1).reverse().toString();
                    System.out.println("Reversed String: " + reversed);
                    break;

                case 2: //Case 2: Checking if the string is palindrome
                    System.out.print("Enter a string to check palindrome: ");
                    String str2 = in.nextLine();
                    String rev2 = new StringBuilder(str2).reverse().toString();
                    if (str2.equalsIgnoreCase(rev2)) {
                        System.out.println("Result: '" + str2 + "' is a Palindrome.");
                    } else {
                        System.out.println("Result: '" + str2 + "' is NOT a Palindrome.");
                    }
                    break;

                case 3: //Case 3: Counting consonents and vowels 
                    System.out.print("Enter a string: ");
                    String str3 = in.nextLine().toLowerCase();
                    int vowels = 0, consonants = 0;
                    for (int i = 0; i < str3.length(); i++) {
                        char ch = str3.charAt(i);
                        if (ch >= 'a' && ch <= 'z') {
                            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                                vowels++;
                            } else {
                                consonants++;
                            }
                        }
                    }
                    System.out.println("Vowels: " + vowels);
                    System.out.println("Consonants: " + consonants);
                    break;

                case 4: //Case 4: Changing the case of the string
                    System.out.print("Enter a string to toggle case: ");
                    String str4 = in.nextLine();
                    StringBuilder toggled = new StringBuilder();
                    for (int i = 0; i < str4.length(); i++) {
                        char ch = str4.charAt(i);
                        if (Character.isUpperCase(ch)) {
                            toggled.append(Character.toLowerCase(ch));
                        } else if (Character.isLowerCase(ch)) {
                            toggled.append(Character.toUpperCase(ch));
                        } else {
                            toggled.append(ch);
                        }
                    }
                    System.out.println("Toggled String: " + toggled.toString());
                    break;

                case 5: //Case 5: Exit out of the program
                    System.out.println("Exiting the String System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select an option between 1 and 5.");
            }
        } while (choice != 5);
        in.close();
    }
}