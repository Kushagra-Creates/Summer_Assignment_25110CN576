import java.util.Scanner;
public class Question46 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to check if it's Armstrong or not through function isArmstrong:");
        int n=in.nextInt();
        if(isArmstrong(n)){
            System.out.println(n+" is an Armstrong number.");
        }
        else{
            System.out.println(n+" is not an Armstrong number.");
        }
        in.close();
    }
    public static boolean isArmstrong(int n){ // Function to check if a number is an Armstrong number
        int original=n;
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n/=10;
        }
        return original==sum; // Check if the original number is equal to the sum of cubes of its digits
    }
}
