import java.util.Scanner;
public class Question43 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to check if it's prime or not through an IsPrime Function");
        int num=in.nextInt();
        boolean isPrime=IsPrime(num); // This calls the IsPrime function with the input number and stores the result in the variable 'isPrime'
        if(isPrime){
            System.out.println(num+" is a prime number.");
        } else {
            System.out.println(num+" is not a prime number.");
        }
        in.close();
    }
    public static boolean IsPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){ // If n is divisible by any number from 2 to the square root of n, it is not prime
                return false;
            }
        }
        return true;
    }
}
