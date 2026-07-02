import java.util.Scanner;
public class Question42 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers to find the maxinum of them through a Max Function");
        int a=in.nextInt();
        int b=in.nextInt();
        int max=Max(a,b); // This calls the Max function with the two input numbers and stores the result in the variable 'max'
        System.out.println("The maximum of the two numbers is: "+max);
        in.close();
    }
    public static int Max(int x,int y){
        return (x>y)?x:y; // This function takes two integers as input and returns the maximum of the two using a ternary operator
    }
}
