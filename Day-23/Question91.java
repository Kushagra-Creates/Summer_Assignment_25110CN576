import java.util.Arrays;
import java.util.Scanner;
public class Question91{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = in.nextLine();
        System.out.println("Enter second string:");
        String s2 = in.nextLine();
        boolean isAnagram = false;
        //If lengths don't match, they can't be anagrams
        if (s1.length() == s2.length()) {
            //Convert both strings to character arrays to sort them easily using the inbuilt function
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            // Sort both arrays alphabetically
            Arrays.sort(arr1);
            Arrays.sort(arr2);     
            //Compare if sorted arrays are identical if they are they are anagrams 
            isAnagram = Arrays.equals(arr1, arr2);
        }
        System.out.println("Are strings anagrams? " + isAnagram);
        in.close();
    }
}