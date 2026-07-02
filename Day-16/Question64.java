import java.util.Scanner;
import java.util.LinkedHashSet;
public class Question64 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];//Declaring the array
        
        System.out.println("Enter the values in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); //Entering the values in the array
        }
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        /*We are using LinkedHashSet cause it'll accept only unique elements by default*/
        for(int num:arr){ //iterating through the array and adding the elements in the LinkedHashSet
            set.add(num);
        }
        int uniqueArr[]=new int[set.size()]; //declaring a new array with the size of the set 
        int index=0;
        for(int num : set){ //Iterating through the elements in Set and adding the elements in the Unique Array
            uniqueArr[index++]=num;
        }
        System.out.println("The array after removing duplicates is: ");
        for(int i : uniqueArr){ //Displaying the Unique Array
                System.out.print(uniqueArr[i]+",");
        }
        in.close();
    }
}
