import java.util.Scanner;
public class Question59 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); // Read array elements from user input
        }
        int temp=arr[n-1]; // Store the last element in a temporary variable
        System.out.println("The array rotated right is:");
        for (int i = n-1; i > 0; i--) { // Shift elements to the right
           arr[i]=arr[i-1];
        }
        arr[0]=temp; // Place the last element at the beginning of the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print the rotated array
        }
        in.close();
    }
}
