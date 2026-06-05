
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        int og=n;
        int d,s=0;
        while(n>0){
        d=n%10;
        s=s+d;
        n=n/10;
        }
        System.out.println("the sum of digits of the number "+og+" is:"+s);
    }
}