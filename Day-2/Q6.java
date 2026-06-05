
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your number");
        int n = sc.nextInt();
        int og=n;
        int d,r=0;
        while(n>0){
        d=n%10;
        r=r*10+d;
        n=n/10;
        }
        System.out.println("the reverse of the number "+og+" is:"+r);
    }
}
