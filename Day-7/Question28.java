import java.util.Scanner;
public class Question28 {
     static int rev;
    public static void main(String args[]){
        System.out.println("Enter the number to recursively reverse it");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        reverseNumber(n); // Call the recursive function to reverse the number
        System.out.println("Reversed number is: " + rev);
        in.close();
    }

    public static void reverseNumber(int n) {
        int rem = 0;
        if (n == 0) {
            return; // Base case: if n is 0, return
        } else {
            rem = n % 10;
            rev = rev * 10 + rem; // Update the reversed number by adding the last digit (rem) to the current reversed number (rev * 10)
            reverseNumber(n / 10); // Recursive case: remove the last digit (n / 10) and call the function again
        }
    }
}