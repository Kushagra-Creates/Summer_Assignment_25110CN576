import java.util.Scanner;
public class Question92{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        char maxChar = '\0';
        int maxCount = 0;
        // we pick out each character
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            int currentCount = 0;    
            // We count how many times it shows up in the whole string using a loop
            for (int j = 0; j < str.length(); j++) {
                if (current == str.charAt(j)) {
                    currentCount++;
                }
            }    
            // If this character appeared more times than our current max count we swap them
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = current;
            }
        }
        if (maxCount > 0) {
            System.out.println("Maximum occurring character: '" + maxChar + "' (Seen " + maxCount + " times)");
        } else {
            System.out.println("String is empty.");
        }
        in.close();
    }
}