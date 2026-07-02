import java.util.Arrays;
import java.util.Scanner;
public class Question80{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row and column of the matrix:");
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] mat = new int[r][c];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = in.nextInt();
            }
        }
        // Array to store the sum of each column
        int[] colSums = new int[c];
        // Sequential Coloums processing
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                colSums[j] += mat[i][j]; // Accumulate into the respective column index
            }
        }
        // Output result printing it without the need of loops 
        System.out.println("Column-wise Sums: " + Arrays.toString(colSums));
        in.close();
    }
}