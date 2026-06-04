import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();
        System.out.print("Prime numbers between " +start+ " and " +end+ ": ");
        if(start<2) {
            start=2;
        }
        for(int i=start; i<=end; i++) {
            if(isPrime(i)) {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        sc.close();
    }
    public static boolean isPrime(int number) {
        if(number<= 1) {
            return false;
        }
        for (int i=2; i<= Math.sqrt(number); i++) {
            if(number%i == 0) {
                return false;
            }
        }
        return true;
    }
}   
