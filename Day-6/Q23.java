import java.util.Scanner;
public class Q23 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number to count the it's set bits");
        int num=in.nextInt();
        int count=0;
        int r=0;
        while(num!=0){ //To iterate through the binary representation of the number until all bits have been processed
            r=num%10;
            if(r==1){
                count++; //To increment the count variable by 1 each time a set bit (1) is encountered in the binary representation of the number.
            }
            num=num/10;
        }
        System.out.println("Number of set bits: " + count);
        in.close();
    }
}
