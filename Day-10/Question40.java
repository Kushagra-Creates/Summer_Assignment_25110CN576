public class Question40 {
    public static void main(String[] args) {
        //same as the previous question 39 just for alphabets
        for (char ch = 'A'; ch <= 'E'; ch++) { //Loop for the number of rows
            for (int space = 0; space < ('E' - ch); space++) { //loop to handel the spaces
                System.out.print(" ");
            }
            for (char ch1 = 'A'; ch1 <= ch; ch1++) { //loop to print first few character in a line
                System.out.print(ch1);
            }
            for (char ch2 = (char)(ch - 1); ch2 >= 'A'; ch2--) { //Loop to print the last few characters in the line
                System.out.print(ch2);
            }
            System.out.println();
        }
    }
}