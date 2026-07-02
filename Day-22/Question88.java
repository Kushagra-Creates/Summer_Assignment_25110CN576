import java.util.Scanner;
public class Question88 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string with spaces:");
        String str = in.nextLine();
        //We use stringbuilder to create a new string without the spaces 
        StringBuilder sb = new StringBuilder(str.length());
        //We iterate through the whole string and add the characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Append only if the character is not a space
            if (ch != ' ' && ch != '\t') {
                sb.append(ch);
            }
        }
        System.out.println("String without spaces: " + sb.toString());
        in.close();
    }
}