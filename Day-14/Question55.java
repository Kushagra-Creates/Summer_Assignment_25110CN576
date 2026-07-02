import java.util.Scanner;
public class Question55 {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=in.nextInt();
        int arr[]=new int[n]; //declare an array of size n to store the elements
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt(); //input the elements of the array from the user
        }
        System.out.println("The second largest element in the array is: ");
        for(int i=0;i<n;i++){ //sort the array in descending order using bubble sort to find the second largest element
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i]; 
                    arr[i]=arr[j];
                    arr[j]=temp; //swap the elements if the current element is smaller than the next element
                }
            }
        }
        System.out.println(arr[1]); //the second largest element will be at index 1 after sorting the array in descending order
        in.close();
    }
}
