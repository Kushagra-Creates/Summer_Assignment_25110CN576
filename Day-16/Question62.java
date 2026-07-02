import java.util.Scanner;
import java.util.HashMap;
public class Question62 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of elements in the array: ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values in the array: ");
        for(int i=0;i<n;i++){ //Entering the values in the array
            arr[i]=in.nextInt();
        }
        HashMap<Integer, Integer> freqMap=new HashMap<>(); //Creating a Hashmap to store Elements of an array along with it's Frequency
        int maxElement=arr[0]; //Variable to store the element with the highest frequency
        int maxfreq=0; //The Maximum frequency 
        for(int i=0;i<n;i++){
            int curr=arr[i];
            int currfreq=freqMap.getOrDefault(curr, 0)+1;
            /*We check if the number already exists in the Hashmap if it does we grab it in currfreq and if it doesn't it'll start at zero
            before adding 1 to the variable*/
            freqMap.put(curr, currfreq); //we put the currelement with it's updated frequency
            if(currfreq>maxfreq){ //We check if the value of currfreq is more than the maximum frequency and change their values
                maxfreq=currfreq;
                maxElement=curr; 
            }
        }
        System.out.println("The number with maximunm frequency is: "+maxElement);
        System.out.println("The maximum frequency is: "+maxfreq);
        in.close();
    }
}
