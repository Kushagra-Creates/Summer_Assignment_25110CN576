import java.util.Scanner;
public class Question56 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt(); //input the elements of the array from the user
        }
        System.out.println("The duplicate elements in the array are:");
        for(int i=0;i<n;i++){ //iterate through the array to find duplicate elements
            for(int j=i+1;j<n;j++){ //compare each element with the rest of the elements in the array to find duplicates
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]); //print the duplicate element
                    break; //break the inner loop to avoid printing the same duplicate element multiple times
                }
            }
        }
        in.close();
    }
}
