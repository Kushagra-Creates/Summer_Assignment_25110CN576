import java.util.*;
public class Q22 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Binary number to change to Decimal");
        int num=in.nextInt();
        int decimal=0; 
        int pow=0; 
        while(num>0){
            int r=num%10;
            decimal=decimal+r*(int)Math.pow(2,pow);
            num=num/10;
        }
        System.out.println("Decimal number is: "+decimal);
            in.close();
    }
}
