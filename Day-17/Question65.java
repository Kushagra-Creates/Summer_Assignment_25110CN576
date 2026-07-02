import java.util.Arrays;
import java.util.Scanner;
public class Question65{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of first array: ");
        int n1=in.nextInt();
        System.out.println("Enter the size of Second array: ");
        int n2=in.nextInt();
        System.out.println("Enter the elements of first array: ");
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){ //Entering the elements in array
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter the elements of Second array: ");
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){ //Entering the elements in array
            arr2[i]=in.nextInt();
        }
        int [] mergedArr=mergeArray(arr1, arr2); //Calling the method to merge the array and storing the result in an array
        System.out.println("Merged Array: " + Arrays.toString(mergedArr));//Converted the array to string to print it without iterating through it
        in.close();
    }
        //Method to merge the arrays taking the both arrays as the input
    private static int[] mergeArray(int[] arr1, int[] arr2) {
       int n1=arr1.length;
       int n2=arr2.length;
       int [] res=new int[n1+n2]; //result array with the size of n1+n2 to store the merged array
        //Inbuilt method to Copy all of arr1 into res starting at index 0 till n1
        System.arraycopy(arr1, 0, res, 0, n1);
    
        //Inbuilt method to Copy all of arr2 into res starting at index n1 till n2
        System.arraycopy(arr2, 0, res, n1, n2);
     
        return res; //returning the result to main method
    }
}