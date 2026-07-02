import java.util.Scanner;
public class Question71 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt(); //Insertion of elements in the array
        }
        System.out.println("Enter the number to be searched");
        int find=in.nextInt();
        int low=0,mid,high=n-1,k=0;
        while(low<high){
            mid=low+(high-low)/2;
            if(find<arr[mid]){
                high=mid-1;
            }
            else if(find>arr[mid]){
                low=mid+1;
            }
            else{
                System.out.println("The element is found at position: "+mid+1);
                k++;
                break;
            }
        }
        if(k==0){
            System.out.println("Element not found");
        }
        in.close();
    }
}
