import java.util.Scanner;
public class Question87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        // Fixed lookup table for all 256 extended ASCII characters
        int[] frequency = new int[256];
        // Single pass population
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
        // Print character counts in order of appearance or alphabetical order
        System.out.println("Character Frequencies:");
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println((char) i + " : " + frequency[i]);
            }
        }
        in.close();
    }
}