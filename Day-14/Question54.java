import java.util.Scanner;
public class Question54 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){ //Entering the Elements
            arr[i]=in.nextInt();
        }
        int freq=0;//Initialising frequency to zero
        System.out.println("Enter the number to find its frequency:");
        int num=in.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==num){ //calculating it's frequency
                freq++;
            }
        }
        System.out.println("Frequency of "+num+" is: "+freq);//Printing the frequency of the Element
        in.close();
    }
}
