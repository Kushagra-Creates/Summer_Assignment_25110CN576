import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n=sc.nextInt();
        int firstTerm=0, secondTerm=1;
        System.out.print("Fibonacci Series: ");
        for (int i=1;i<=n;++i) {
            System.out.print(firstTerm+ " ");
            int nextTerm=firstTerm + secondTerm;
            firstTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}   