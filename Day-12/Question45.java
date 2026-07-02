import java.util.Scanner;
public class Question45 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome or not through function isPalindrome:");
        int n=in.nextInt();
        if(isPalindrome(n)){ // Check if the number is a palindrome
            System.out.println(n+" is a palindrome.");
        }
        else{
            System.out.println(n+" is not a palindrome.");
        }
        in.close();
    }
    public static boolean isPalindrome(int n){ // Function to check if a number is a palindrome
        int original=n;
        int reverse=0;
        while(n!=0){
            reverse=reverse*10+n%10; 
            n/=10;
        }
        return original==reverse; // Check if the original number is equal to its reverse
    }
}
