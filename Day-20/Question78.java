import java.util.Scanner;
public class Question78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row and column of First matrix:");
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        // A matrix can only be symmetric if it's a square Matrix
        if (r1 != c1) { 
            System.out.println("The Matrix cannot be symmetric as it's not a square matrix");
            in.close();
            return; // Terminate execution immediately
        }
        System.out.println("Enter the Elements of first matrix:");
        int arr1[][] = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = in.nextInt();
            }
        }
        boolean isSymmetric = true;
        // Check only the upper triangle (j > i) to save half the iterations
        for (int i = 0; i < r1; i++) {
            for (int j = i + 1; j < c1; j++) {
                // Correct 2D array syntax used here
                if (arr1[i][j] != arr1[j][i]) {
                    isSymmetric = false;
                    break; // Instant termination on mismatch
                }
            }
            if (!isSymmetric) break;
        }
        if(isSymmetric) System.out.println("The matrix is symmetric");
        else System.out.println("The matrix is not symmetric");
        in.close();
    }
}