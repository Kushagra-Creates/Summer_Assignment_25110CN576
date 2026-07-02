import java.util.Scanner;
public class Question84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string in lowercase or mixed case:");
        String str = in.nextLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            // If the character is a lowercase alphabetic letter
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                // Subtract 32 from ASCII value and cast back to char
                chars[i] = (char) (chars[i] - 32);
            }
        }
        String upperStr = new String(chars);
        System.out.println("Uppercase string: " + upperStr);
        in.close();
    }
}