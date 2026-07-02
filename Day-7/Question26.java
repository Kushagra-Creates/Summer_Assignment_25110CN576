import java.util.Scanner;
public class Question26 {
    public static void main(String args[]){
        System.out.println("Enter the number to find it's fibonacci series using recursion");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Fibonacci series up to " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(findFibonacci(i) + " "); // calling the method to find fibonacci series
        }
        in.close();
    }

    public static int findFibonacci(int n) { // method to find fibonacci series using recursion
        if (n == 0) {
            return 0; // case 1: fibonacci of 0 is 0
        } else if (n == 1) {
            return 1; // case 2: fibonacci of 1 is 1
        } else {
            return findFibonacci(n - 1) + findFibonacci(n - 2); // case 3: fibonacci of n is sum of fibonacci of (n-1) and (n-2)
        }
    }
}
