public class Question39 {
    public static void main(String[] args) {
    for(int i=1;i<=5;i++){ //Loop for the number of rows
        for(int j=1;j<5-i;j++){ //Loop to print the spaces
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){ //Loop to print the first few numbers
            System.out.print(j);
        }
        for(int k=i-1;k>=1;k--){ //Loop to print the last few number
            System.out.print(k);
            
        }
        System.out.println();
    }
}
}
