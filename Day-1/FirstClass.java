//Q.1
import java.util.Scanner;

//WAP to calculate the sum of first N natural numbers.
public class FirstClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        int n = sc.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The sum of natural numbers from 1 to "+n+" is:"+sum);
        sc.close(); 
}
}