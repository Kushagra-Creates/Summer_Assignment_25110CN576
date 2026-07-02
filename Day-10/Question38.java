public class Question38 {
    public static void main(String args[]) {
       for(int i=5;i>=1;i--){ //Loop for the number of rows
        for(int j=1;j<5-i;j++){ //Loop for printing the spaces
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++){ //Loop to print an inverted triangle
            System.out.print("*");
        }
        System.out.println();
       }
    }
}