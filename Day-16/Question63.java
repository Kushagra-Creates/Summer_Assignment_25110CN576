import java.util.Scanner;
import java.util.HashSet;
public class Question63 {
    public static void main(String args[]){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n=in.nextInt();
        System.out.println("Enter the Elements in the array: ");
        int arr[]=new int[n]; 
        for(int i=0;i<n;i++){ //Entering the values in the array
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the targetted sum: ");
        int sum=in.nextInt();
        findSum(arr,sum); //Method to find the pair with targetted sum
        in.close();
    }

    private static void findSum(int[] arr, int sum) {
        HashSet<Integer> seenNum=new HashSet<>(); //creating a hashset to hold the numbers that are seen or are iterated through
        boolean foundPair=false; //Boolean variable to see if the number if found or not
        for(int num : arr){
            int complement=sum-num; //we find the compliment of the num with targetted sum
            if(seenNum.contains(complement)){ 
                /*If the set contain the number [complemeent] we would print the complement and the number as the pair*/
                System.out.println("Pair found: "+complement+","+num);
                foundPair=true;
                break;//break the loop to avoid going through the whole array after finding the pair
            }
            seenNum.add(num);//if we're unable to find the valid pair we'll just add the num to the set 
        }
        if(!foundPair){ //if we aren't able to find the pair anywhere in the loop
            System.out.println("No such pair of numbers found that add up to sum");
        }
    }
}
