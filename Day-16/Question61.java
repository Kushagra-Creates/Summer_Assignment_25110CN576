import java.util.Scanner;
public class Question61 {
public static void main(String args[]){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the number of elements in the array:");
    int n=in.nextInt(); //Size of the array
    int[] arr=new int[n]; //Array declaration
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<n;i++){ //Loop to input the array
        arr[i]=in.nextInt();
    }
    boolean found=false; 
    System.out.println("The missing numbers are:");
    for(int i=1;i<=n;i++){ //Loop to iterate through numbers from 1 to n
        found=false;
        for(int j=0;j<n;j++){ //Loop to iterate through the array 
            if(arr[j]==i){
                found=true; //If the number is found we update the boolean variable and break the loop
                break;
            }
        }
        if(!found){ //if found is not true we print the number that's not found
            System.out.print(i+" ");
        }
    }
    in.close();
}    
}
