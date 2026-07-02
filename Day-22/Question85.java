import java.util.Scanner;
public class Question85 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = in.nextLine();
        boolean palindrome = true; //variable to check if the string is palindrome or not
        int left = 0;
        int right = str.length() - 1;
        /* We are going to use two pointers pointing to the first and the last character of the string and we'll check if they are equal and break if they are not at any point */
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                palindrome = false;
                break; // Break if there's a mismatch
            }
            left++;
            right--;
        }
        System.out.println("Is palindrome? " + palindrome);
        in.close();
    }
}
