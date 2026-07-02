import java.util.Scanner;
public class Question44 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to find its factorial through a Factorial Function");
        int num=in.nextInt();
        long factorial=Factorial(num); // This calls the Factorial function with the input number and stores the result in the variable 'factorial'
        System.out.println("The factorial of "+num+" is: "+factorial);
        in.close();
    }
    public static long Factorial(int n){
        if(n<0){
            return -1; // Factorial is not defined for negative numbers
        }
        long result=1;
        for(int i=1;i<=n;i++){
            result*=i; // Multiply result by each number from 1 to n
        }
        return result; // Return the final factorial value
    }
}
