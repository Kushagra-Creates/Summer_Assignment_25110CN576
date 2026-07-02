import java.util.Scanner;
public class Question60 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); // Read array elements from user input1
        }
        System.out.println("Array with all the zeros at the end:");
        int count=0; // Count of non-zero elements
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                arr[count++]=arr[i]; // Move non-zero elements to the front
            }
        }
        while (count < n) { // Fill the remaining positions with zeros
            arr[count++] = 0;
        }
        for (int i = 0; i < n; i++) {  // Print the modified array
            System.out.print(arr[i] + " ");
        }
        in.close();
    }
}
