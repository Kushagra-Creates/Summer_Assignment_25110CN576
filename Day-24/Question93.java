import java.util.Scanner;
public class Question93{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter original string:");
        String s1 = in.nextLine();
        System.out.println("Enter rotated string to check:");
        String s2 = in.nextLine();
        boolean isRotated = false;
        //The strings must be of identical length and not empty
        if (s1.length() == s2.length() && s1.length() > 0) {
            // We concat s1 with itself 
            String combined = s1 + s1;
            // We check if s2 exists inside the combined string if it does we've got a rotated string
            isRotated = combined.contains(s2);
            // Using the inbuilt function contains 
        }
        System.out.println("Is it a rotation? " + isRotated);
        in.close();
    }
}