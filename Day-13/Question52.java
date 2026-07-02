import java.util.Scanner;
public class Question52 {
     public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int[] arr=new int[n]; // declaration and instantiation of array
        System.out.println("Enter the elements of array");  
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt(); // input of array elements
        }
        int evenCount=0,oddCount=0; //counter for even and odd elements in array
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){ // calculation of even and odd elements in array
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Number of even elements in array: "+evenCount);
        System.out.println("Number of odd elements in array: "+oddCount);
        in.close();
    }
}
