import java.util.Scanner;
public class Question58 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n=in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); // Read array elements from user input
        }
        int temp=arr[0]; // Store the first element in a temporary variable
        System.out.println("The array rotated left is:");
        for (int i = 1; i < n; i++) { // Shift elements to the left
           arr[i-1]=arr[i];
        }
        arr[n-1]=temp; // Place the first element at the end of the array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " "); // Print the rotated array
        }
        in.close();
    }
}
