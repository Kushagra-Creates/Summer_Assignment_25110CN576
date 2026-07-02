public class Question33 {
    public static void main(String[] args) {
       for(int i=5;i>=1;i--){ //outer loop that controls the number of rows 
        for(int j=1;j<=i;j++){ //inner loop that controls the number of columns and prints the asterisk
            System.out.print("*");
        }
        System.out.println();
       }
}
}