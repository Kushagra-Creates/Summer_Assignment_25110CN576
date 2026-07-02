public class Question32 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){  //outer loop for printing the rows
            for (int j=1;j<=i;j++){ //inner loop for printing the numbers
                System.out.print(i);
            }
            System.out.println();
        }
    }
}