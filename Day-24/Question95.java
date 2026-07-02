import java.util.Scanner;
public class Question95{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = in.nextLine();
        //We split sentence into an array of words using space as a divider
        String[] words = sentence.split(" ");
        String longestWord = "";
        //We run through each word and find the champion
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word; //Check and exchange the longest word with the current word 
            }
        }
        System.out.println("The longest word is: " + longestWord);
        in.close();
    }
}