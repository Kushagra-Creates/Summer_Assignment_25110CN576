public class Question35 {
    public static void main(String[] args) {
        for(char ch='A';ch<='E';ch++){ //outer loop that controls the number of lines to be printed
            for(char c='A';c<=ch;c++){ //inner loop that controls the number of characters to be printed in each line
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
