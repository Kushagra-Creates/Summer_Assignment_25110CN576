import java.util.Scanner;
public class Question98{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = in.nextLine();
        System.out.println("Enter second string:");
        String s2 = in.nextLine();
        System.out.print("Common characters: ");
        // Iterate through the first string character by character
        for (int i = 0; i < s1.length(); i++) {
            char current = s1.charAt(i);    
            // Check if this character exists anywhere in s2 using the indexOf
            int matchIndex = s2.indexOf(current);
            
            if (matchIndex != -1) {
                // Print the common character if it exists in the second string
                System.out.print(current + " ");
                
                // Remove the character from s2 so it isn't matched again 
                s2 = s2.substring(0, matchIndex) + s2.substring(matchIndex + 1);
            }
        }
        System.out.println();
        in.close();
    }
}