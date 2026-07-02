import java.util.Scanner;
import java.util.HashSet;
public class Question66 {
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
            arr1[i]=in.nextInt();
        }
        System.out.println("Enter the elements in the Second array: ");
        for(int i=0;i<n2;i++){
            arr2[i]= in.nextInt();
        }
        HashSet<Integer> set=new HashSet<>(); 
        /*We'll use HashSet for this as it doesn't take duplicate values and will make a unique(Union) of the two arrays */
        for(int num:arr1){ 
            set.add(num); //Adding the numbers from first array in the set
        }
        for(int num: arr2){ //Adding the numbers from first array in the set
            set.add(num);
        }
        System.out.println("The union of the arrays is:"+set);
        in.close();
    }
}
