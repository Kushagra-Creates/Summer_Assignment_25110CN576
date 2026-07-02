public class Question31 {
    public static void main(String args[]){
        for(char ch='A';ch<='E';ch++){ //outer loop for printing the rows
            for(char c='A';c<=ch;c++){ //inner loop for printing the characters
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
