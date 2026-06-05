
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        int og=n;
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev = rev*10+d;
            n=n/10;
        }
        if(og == rev){
            System.out.println(og+" is a palindrome number");
        }
        else{
            System.out.println(og+" is not a palindrome number");
        }
    }
}
