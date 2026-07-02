
import java.util.Scanner;

public class Q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Number: ");
    int num=sc.nextInt();
    int sum=0;
    if(num<=0){
        System.out.println("Invalid Input.Enter an integer!");//if user inputs 1 or 0
    }
    else if(num==1){
        System.out.println(num+" is not a perfect number");
    }
    else{
        for(int i=1;i<=num/2;i++)
            if(num%i==0){
                sum=sum+i;
            }
        }
    if(sum==num){
        System.out.println(num+"is a perfect number");
    }
    else{
        System.out.println(num+"is not a perfect number");
    }
}
    }
