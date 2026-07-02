import java.util.Scanner;
public class Question86 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = in.nextLine();
        int wordc = 0;
        boolean isWord = false; //Variable to check if it's a word 
        for (int i = 0; i <= str.length()-1; i++) {
            // Check if character is not a space
            if (str.charAt(i) != ' ') {
                if (isWord==false) {
                    wordc++; //we increase the word count 
                    isWord = true; 
                }
            } else {
                isWord = false; 
            }
        }
        System.out.println("Total word count: " + wordc);
        in.close();
    }
}