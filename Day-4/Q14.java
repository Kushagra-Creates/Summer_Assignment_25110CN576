 import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter n to find the nth Fibonacci number: ");
        int n=scanner.nextInt();
        scanner.close();
        if(n<0) {
            System.out.println("Please enter a non-negative integer.");
        } else if(n==0) {
            System.out.println("The 0th Fibonacci number is 0");//if user inputs zero for i dont know what reason.?
        } else {
            int first=0, second=1;
            if (n==1) {
                System.out.println("The 1st Fibonacci number is 1");
            } else {
                for (int i=2; i<=n;i++) {
                    int next=first + second;
                    first=second;
                    second=next;
                }
                System.out.println("The " +n+ "th Fibonacci number is " +second);
            }
        }
    }
}   
