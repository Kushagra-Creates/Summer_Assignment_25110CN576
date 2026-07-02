import java.util.Scanner;
public class Question73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int r = in.nextInt();
        int c = in.nextInt();
        int matrix1 [][] = new int[r][c]; 
        int matrix2 [][] = new int[r][c];
        int sum [][]= new int[r][c]; //Matrix to store the sum 
        System.out.println("Enter elements of Matrix 1: ");                                     
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix1[i][j] = in.nextInt();   //Insertion of elements in first Matrix  
        System.out.println("Enter elements of Matrix 2: ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                matrix2[i][j] = in.nextInt();  //Insertion of elements in second matrix
        //Loop for Addition 
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j]; //Adding both matrix and storing it 
            }
        }
        System.out.println("Resulting Matrix after Addition: ");
         for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
    