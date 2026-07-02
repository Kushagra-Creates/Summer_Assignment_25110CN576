import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

public class Question68{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements of first array: ");
        int n1 = in.nextInt();
        System.out.println("Enter the number of elements of second array: ");
        int n2 = in.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println("Enter the elements in the first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
            set.add(arr1[i]); // Store unique elements from arr1
        }
        System.out.println("Enter the elements in the Second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
            // If it exists in the set, it's a common element
            if (set.contains(arr2[i])) {
                result.add(arr2[i]);
                set.remove(arr2[i]); // Prevents tracking duplicate common elements
            }
        }        
        System.out.println("Common Elements: " + result);
        in.close();
    }
}