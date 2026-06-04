
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if(n<2){
            System.out.println(n+" is not a prime number.");
        }
        else{
            boolean prime =true;

            for(int i=2;i*i<=n;i++){
            if(n%i==0){
                prime = false;
                break;
            }
        }
        if(prime){
                System.out.println(n+" is a prime number");
            }
            else{
                System.out.println(n+" is not prime number");
            }
        }
    }
}

