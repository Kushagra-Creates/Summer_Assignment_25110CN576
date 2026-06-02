
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        System.out.print("Multiplication table of "+n+":\n");
        for(int i=1;i<=10;i++){
            System.out.println(n+"x" + i + "="+(n*i));
        }
    }
}