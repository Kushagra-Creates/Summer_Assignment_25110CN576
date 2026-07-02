import java.util.Scanner;
import java.util.HashSet;
public class Question67 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements of first array: ");
        int n1=in.nextInt();
        System.out.println("Enter the number of elements of second array: ");
        int n2=in.nextInt();
        System.out.println("Enter the elements in the first array: ");
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=in.nextInt(); //Insertion of elements in first array 
        }
        System.out.println("Enter the elements in the Second array: ");
        for(int i=0;i<n2;i++){
            arr2[i]= in.nextInt(); //Insertion of elements in Second array 
        }
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> intersection=new HashSet<>();
        /*We make two HashSets one to store the elements of first array and other one to add the intersection of arrays using the first hashset*/
        for(int num: arr1){
            set1.add(num); //Store all elements of first array in first Set
        }
        for(int num: arr2){
            if(set1.contains(num)){ //Check if elements of the second array exist in set1
                intersection.add(num); //Avoids adding duplicates in the result
            }
        }
        System.out.println("Intersection of arrays is: " + intersection);
        in.close();
    }
}
