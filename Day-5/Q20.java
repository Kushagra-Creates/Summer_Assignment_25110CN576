
import java.util.Scanner;

public class Q20 { //wap to find largest prime factors.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbr:");
        int n=sc.nextInt();
        System.out.println("The largest prime factor is: "+getlargefactor(n));
        sc.close();
    }
    public static long
    getlargefactor(long n){
        long maxprime=-1;
        while(n%2==0){
            maxprime=2;
            n=n/2;
        }
        for(int i=3;i*i<=n;i=i+2){
            while (n%i==0){
                maxprime=i;
                n=n/i;
            }
            }
            if(n>2){
                maxprime=n;
            }
            return maxprime;
        }
    }
