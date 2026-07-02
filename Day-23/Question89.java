import java.util.Scanner;
public class Question89{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        char result = '\0'; //Declaring and Initializing the characcter variable with default vallue
        // Pick each character one by one
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            boolean duplicate = false;    
            // Check the taken out character against every other character in the string
            for (int j = 0; j < str.length(); j++) {
                if (i != j && currChar == str.charAt(j)) {
                    duplicate = true;
                    break; // Stop looking, this one repeats
                }
            }    
            // If we went through the whole string and found no duplicate
            if (!duplicate) {
                result = currChar;
                break; // Found our first non-repeating character!
            }
        }
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
        in.close();
    }
}