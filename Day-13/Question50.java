import java.util.Scanner;
public class Question50 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int[] arr=new int[n]; // declaration and instantiation of array
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt(); // input of array elements
        }
        int sum=0,avg=0;
        for(int i=0;i<n;i++){
            sum+=arr[i]; // calculation of sum of array elements
        } 
        avg=sum/n; // calculation of average of array elements
        System.out.println("Sum of array elements: "+sum);
        System.out.println("Average of array elements: "+avg);
        in.close();
    }
}
