import java.util.Scanner;
public class Q21{
    public static void main(String args[]){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the Decimal number to change to Binary");
       int num = in.nextInt();
       String binary = ""; 
       int r=0;
       while (num > 0) {
           r= num % 2;;
           binary =r+binary; //To concatenate the remainder (r) to the left of the existing binary string.
           num = num / 2; //To update num by dividing it by 2, effectively shifting the bits to the right for the next iteration.
       }
       System.out.println("Binary number is: " + binary);
         in.close();
    }
}