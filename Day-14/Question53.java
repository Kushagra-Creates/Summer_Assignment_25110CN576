import java.util.Scanner;
public class Question53{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");  
        for(int i=0;i<n;i++) //input array elements
        {
            arr[i]=in.nextInt();
        }
        System.out.println("enter the number to be searched:");
        int num=in.nextInt();  
        boolean found=false; //flag to check if number is found
        for(int i=0;i<n;i++) //search for the number in the array in Linear search manner
        { 
            if(arr[i]==num)
            {
                found=true; //set flag to true if number is found and we break the loop
                break;
            }
        }        if(found)
        {
            System.out.println(num+" is found in the array.");
        }
        else
        {
            System.out.println(num+" is not found in the array.");
        }
        in.close();
    }
}