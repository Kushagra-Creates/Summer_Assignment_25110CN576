import java.util.Scanner;
public class Question81 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        int length = 0;
        // Convert to char array and count each character manually
        for (char c : str.toCharArray()) {
            length++;
        }
        System.out.println("Length of the string: " + length);
        in.close();
    }
}