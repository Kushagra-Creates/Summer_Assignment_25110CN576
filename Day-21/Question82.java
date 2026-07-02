import java.util.Scanner;
public class Question82 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str = in.nextLine();
        char chars[] = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        // Using two pointers to reverse the string
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            //Exchanging the characters in reverse order
            left++;
            right--;
        }
        // Construct the final reversed string from the char array
        String reversed = new String(chars);
        System.out.println("Reversed string: " + reversed);
        in.close();
    }
}