import java.util.Arrays;
import java.util.Scanner;
public class Question99{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many names do you want to sort?");
        int n = in.nextInt();
        in.nextLine(); // Cleaning the trailing newline character
        String[] names = new String[n]; //Creating an array to store the names
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) { //Inserting the names into the array
            names[i] = in.nextLine();
        }
        // We can sort the String array using .sort() as it automatically sorts the strings in Alphabetical order
        Arrays.sort(names);
        System.out.println("Names in alphabetical order: " + Arrays.toString(names));
        in.close();
    }
}