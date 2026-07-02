import java.util.Scanner;
public class Question41{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers to add them through a Sum Function");
        int a=in.nextInt();
        int b=in.nextInt();
        int sum=Sum(a,b); // This calls the Sum function with the two input numbers and stores the result in the variable 'sum'
        System.out.println("The sum of the two numbers is: "+sum);
        in.close();
    }
    public static int Sum(int x,int y){
        return x+y; // This function takes two integers as input and returns their sum
    }
}