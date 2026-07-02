import java.util.Scanner;
public class Question83 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        int vowels = 0;
        int cons = 0;
        // convert to lower case to remove any mismatch
        String lowerStr = str.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            
            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } 
            // Check if it's a valid alphabetic consonant
            else if (ch >= 'a' && ch <= 'z') {
                cons++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + cons);
        in.close();
    }
}