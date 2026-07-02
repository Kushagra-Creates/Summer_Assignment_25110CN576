public class Question36 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){ // outer loop for printing the rows of the square
            for(int j=1;j<=5;j++){ // inner loop for printing the columns of the square
                if(i==1 || i==5 || j==1 || j==5){ // condition for printing stars at the borders in the form of a square
                    System.out.print("*");
                }
                else{
                    System.out.print(" "); // condition for printing blank spaces in the inner part of the square
                }
            }
            System.out.println();
        }
    }
}
