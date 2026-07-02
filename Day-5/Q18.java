
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check");
        int num=sc.nextInt();
        int og=num;
        int sum=0;
        while (num>0){
            int d=num%10;
            int fact=1;
            for(int i=1;i<=d;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(sum==og){
            System.out.println(og+" is a strong number");
        }
        else{
            System.out.println(og+" is not a strong number");
        }
            sc.close();
        }
    }

