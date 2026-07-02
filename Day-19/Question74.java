import java.util.Scanner;
public class Question74 {
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter r and columns: ");
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[r][c];
        int[][] diff = new int[r][c]; //Matri to store the difference 
        System.out.println("Enter elements of Matrix 1: ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix1[i][j] = in.nextInt(); //Printing the First matrix 
                
        System.out.println("Enter elements of Matrix 2: ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix2[i][j] = in.nextInt(); //Printing the second matrix 
        
        //Loop for Subtraction
        for (int i = 0; i < r; i++) { 
            for (int j = 0; j < c; j++) {
                diff[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        System.out.println("Resulting Matrix after Subtraction: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) { 
                System.out.print(diff[i][j] + " "); // Printing the resultant matrix
            }
            System.out.println();
        }
        in.close();
    }
}