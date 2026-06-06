
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the start of range");
        int a=sc.nextInt();
        System.out.println("enter end of the range");
        int b=sc.nextInt();
        for (int i=a;i<=b;i++){
            int temp=a;
            int sum=0;
            int digits=0;
            int og=i;
            while(temp>0){  //count logic
                digits++;
                temp=temp/10;
        }
        temp=i;
        while(temp>0){
            int r=temp%10;
            int power=1;
            for (int j=0; j<digits;j++) {
                power=power*r;
            }
        sum=sum+power;
        temp=temp/10;
        }
        if(sum==og){
            System.out.print(og+ " ");
        }
    }
    sc.close();
}
}