import java.util.Arrays;
import java.util.Scanner;
public class Question97{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Input the First Array
        System.out.println("Enter size of first sorted array:");
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n1; i++) arr1[i] = in.nextInt();
        // Input the Second Array
        System.out.println("Enter size of second sorted array:");
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < n2; i++) arr2[i] = in.nextInt();
        // Create a combined array to store the result
        int[] merged = new int[n1 + n2];
        // Copy elements from the first array
        for (int i = 0; i < n1; i++) {
            merged[i] = arr1[i];
        }
        // Copy elements from the second array right after the first
        for (int i = 0; i < n2; i++) {
            merged[n1 + i] = arr2[i];
        }
        // Sort the final combined array using the builtin function 
        Arrays.sort(merged);
        System.out.println("Merged and Sorted Array: " + Arrays.toString(merged)); //Printing the Array as a string to avoid the unnecessary loops  
        in.close();
    }
}