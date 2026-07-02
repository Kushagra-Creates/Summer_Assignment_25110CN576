import java.util.Scanner;

public class Question75{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter r and columns of the matrix: ");
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] matrix = new int[r][c];
        // we swap the dimensions in the new matrix to hold the transpose
        int[][] transpose = new int[c][r]; 
        System.out.println("Enter elements of the matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = in.nextInt(); //Insertion of elements in the first matrix 
            }
        }
        // Storing the transpose of Matrix 
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transposed Matrix: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(transpose[i][j] + " ");
            } //Printing the resultant matrix
            System.out.println();
        }
        in.close();
    }
}