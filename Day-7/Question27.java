import java.util.Scanner;
public class Question27 {
    public static void main(String args[]){
        System.out.println("Enter the number to find the sum of digits using recursion");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = findSum(n); // Call the recursive function to find the sum of digits
        System.out.println("Sum of digits of " + n + " is: " + sum);
        in.close();
    }

    public static int findSum(int n) {
        if (n == 0) {
            return 0; // Base case: if n is 0, return 0
        } else {
            return (n % 10) + findSum(n / 10); // Recursive case: add the last digit (n % 10) to the sum of the remaining digits (n / 10)
        }
    }
}
