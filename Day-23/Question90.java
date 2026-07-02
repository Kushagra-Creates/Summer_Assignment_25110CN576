import java.util.Scanner;
public class Question90{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        char result = '\0'; //Declaring and Initializing the characcter variable with default vallue
        // We start from the second character (index 1)
        for (int i = 1; i < str.length(); i++) {
            char current = str.charAt(i);    
            // Look at the previous character and check everything before index i
            for (int j = 0; j < i; j++) {
                if (current == str.charAt(j)) {
                    result = current;
                    break; // If we found a match break the loop
                }
            }
            if (result != '\0') break; // Exit outer loop too
        }
        if (result != '\0') {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating characters found.");
        }
        in.close();
    }
}