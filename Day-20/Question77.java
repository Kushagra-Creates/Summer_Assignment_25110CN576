import java.util.Scanner;
public class Question77 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the row and column of First matrix:");
        int r1 = in.nextInt();
        int c1 = in.nextInt();
        System.out.println("Enter the row and column of the Second matrix:");
        int r2 = in.nextInt();
        int c2 = in.nextInt();
        // Multiplication of matrices condition
        if (c1 != r2) {
            System.out.println("The matrices cannot be multiplied");
            // Terminate execution immediately if dimensions don't match
        }
        System.out.println("Enter the Elements of first matrix:");
        int arr1[][] = new int[r1][c1];//Entering the elements of array
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the Elements of Second matrix:");
        int arr2[][] = new int[r2][c2]; //Entering the elements of array
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = in.nextInt();
            }
        }
        //Result matrix initialization
        int[][] res = new int[r1][c2]; 
        for (int i = 0; i < r1; i++) {
            for (int k = 0; k < c1; k++) {
                int aVal = arr1[i][k];
                for (int j = 0; j < c2; j++) {
                    res[i][j] += aVal * arr2[k][j]; //Logic to multiply the Two matrices
                }
            }
        }
        System.out.println("Elements of First array");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(arr1[i][j]+" "); //printing the array
            }
            System.out.println();
        }
        System.out.println("Elements of Second array");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(arr2[i][j]+" "); //printing the array
            }
            System.out.println();
        }
        System.out.println("Multiplication Of Matrices");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(res[i][j]+" "); //Printing the rtesult
            }
            System.out.println();
        }
        in.close(); 
    }
}