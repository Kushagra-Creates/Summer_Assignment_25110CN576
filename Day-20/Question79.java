import java.util.Arrays;
import java.util.Scanner;
public class Question79{
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
        // Array to store the sum of each row
        int[] rowSums = new int[r];
        // Sequential Row Processing
        for (int i = 0; i < r; i++) {
            int currRowSum = 0;
            for (int j = 0; j < c; j++) {
                currRowSum += mat[i][j];
            }
            rowSums[i] = currRowSum;
        }
        // Output result printing it without the need of loops 
        System.out.println("Row-wise Sums: " + Arrays.toString(rowSums));
        in.close();
    }
}