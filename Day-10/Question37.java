public class Question37 {
    public static void main(String[] args) {
       for(int i=1;i<=5;i++){ //Loop for the number of rows 
        for(int j=1;j<5-i;j++){ //loop to print spaces
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++){ //loop to print the pyramid 
            System.out.print("*");
        }
        System.out.println();
       }
    }
}