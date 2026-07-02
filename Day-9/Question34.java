public class Question34 {
    public static void main(String args[]){
        for(int i=5;i>=1;i--){ // outer loop is responsible for printing the rows, it starts from 5 and decrements down to 1
            for(int j=1;j<=i;j++){ // inner loop is responsible for printing the numbers in each row
                System.out.print(j); 
            }
            System.out.println();
        }
    }
}
