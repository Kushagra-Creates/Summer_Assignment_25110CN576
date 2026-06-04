import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        int a=num1;
        int b=num2;
        while(num2!=0) {
            int temp=num2;
            num2=num1 % num2;
            num1=temp;
        }
        int lcm=(int) ((Math.abs((long) a * b)) / num1);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
}   