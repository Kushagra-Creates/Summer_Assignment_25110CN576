import java.util.Scanner;
public class Question48 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to check if it's perfect or not through function isPerfect:");
        int n=in.nextInt();
        if(isPerfect(n)){
            System.out.println(n+" is a perfect number.");
        }
        else{
            System.out.println(n+" is not a perfect number.");
        }
        in.close();
    }
    public static boolean isPerfect(int n){ // Function to check if a number is a perfect number
        int sum=0;
        for(int i=1; i<n; i++){ // Loop to find all proper divisors of n and sum them up
            if(n%i==0){
                sum+=i;
            }
        }
        return sum==n; // Check if the sum of proper divisors is equal to the original number
    }
}
