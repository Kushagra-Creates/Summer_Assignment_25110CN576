import java.util.Scanner;
public class Question94{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to compress");
        String str = in.nextLine();
        String compressed = "";
        int count = 1; // To count the number of same characters in the string
        for (int i = 0; i < str.length(); i++) {
            // If the next character is the same, just increase the count 
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } 
            // If the next character is different (or it's the end of the string)
            else {
                compressed += str.charAt(i) + "" + count;
                count = 1; // We reset count for the next unique character and put the character in the compressed string 
            }
        }
        // We return original string if compression doesn't happens
        if (compressed.length() < str.length()) {
            System.out.println("Compressed string: " + compressed);
        } else {
            System.out.println("Compressed string: " + str);
        }
        in.close();
    }
}