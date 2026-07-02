import java.util.Arrays;
import java.util.Scanner;
public class Question100{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a str or a series of words separated by spaces:");
        String str = in.nextLine();
        // We split the string into an array of words
        String[] words = str.split(" ");
        // Using Bubble Sort to arrange them by length
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1 - i; j++) {
                //We compare lengths of adjacent words
                if (words[j].length() > words[j + 1].length()) {
                    // We swap the words if the current one is longer than the next (ascending order)
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        System.out.println("Words sorted by length: " + Arrays.toString(words));
        in.close();
    }
}