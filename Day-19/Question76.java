import java.util.Scanner;
public class Question76 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix (N x N): ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt(); //Insertion of elements in the Matrix
            }
        }
        int primarySum = 0;
        int secondarySum = 0;
        //We want to find the sum of principal(j==i) as well as secondary diagonal(j=n-1-i)  
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];          // Elements where row == col
            secondarySum += matrix[i][n - 1 - i]; // Elements from top-right to bottom-left
        }
        System.out.println("Sum of Primary Diagonal: " + primarySum);
        System.out.println("Sum of Secondary Diagonal: " + secondarySum);
        in.close();
    }
}