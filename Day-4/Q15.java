import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");//applied logic of 3 digit number.
        int num=sc.nextInt();
        int temp=num;
        int sum=0;
        while (temp>0) {
            int d=temp%10;
            sum+=d*d*d;
            temp/=10;
        }
        if (sum == num) {
            System.out.println(num+ " is an Armstrong number.");
        } else {
            System.out.println(num+ " is not an Armstrong number.");
        }
        sc.close();
    }
}   