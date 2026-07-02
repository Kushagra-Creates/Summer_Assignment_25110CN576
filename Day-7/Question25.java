import java.util.Scanner;
public class Question25 {
    public static void main(String args[]){
        System.out.println("Enter the number to find its factorial using recursion");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = findFactorial(n); // calling the method to find factorial
        System.out.println("Factorial of " + n + " is: " + f);
        in.close();
    }

    public static int findFactorial(int n) {
        if (n == 0 || n == 1) { // case 1: factorial of 0 or 1 is 1
            return 1;
        } else {
            return n * findFactorial(n - 1); // case 2: factorial of n is n multiplied by factorial of (n-1)
        }
    }
}
