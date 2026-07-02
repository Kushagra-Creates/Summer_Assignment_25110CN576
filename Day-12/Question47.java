import java.util.Scanner;
public class Question47 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number till which you want to print Fibonacci series through function printFibonacci:");
        int n=in.nextInt();
        printFibonacci(n); // Call the function to print Fibonacci series up to n
        in.close();
    }
    public static void printFibonacci(int n){ // Function to print Fibonacci series up to n
        int first=0, second=1;
        System.out.print(first+" "+second+" ");
        for(int i=2; i<n; i++){ // Loop to generate Fibonacci numbers until we reach n
            int next=first+second;
            System.out.print(next+" ");
            first=second;
            second=next; // Update first and second for the next iteration
        }
    }
}
