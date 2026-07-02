public class Question29 {
    public static void main(String args[]){
        for(int i=0;i<=5;i++){ //outer loop for printing the rows
            for(int j=0;j<=i;j++){ //inner loop for printing the stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
