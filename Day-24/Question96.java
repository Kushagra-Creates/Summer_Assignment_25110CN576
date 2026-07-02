import java.util.Scanner;
public class Question96{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);    
            //We convert character to a String to check if result already contains it
            if (!result.contains(String.valueOf(current))) {
                result += current; // We add only unique characters
            }
        }
        System.out.println("String after removing duplicates: " + result);
        in.close();
    }
}