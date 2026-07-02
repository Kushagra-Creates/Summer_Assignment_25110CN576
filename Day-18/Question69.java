import java.util.Scanner;
public class Question69 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt(); //Insertion of elements in the array
        }
        for(int i=0;i<n;i++){ //loop  fo handle the number of iterations
            for(int j=0;j<n-1-i;j++){ //Loop to handle the checking of each element with the consequative one 
                while(arr[j]>arr[j+1]){ //For Ascending order
                    int temp=arr[j]; //Temp element to store the value of element at arr[j]
                    arr[j]=arr[j+1]; //Exchanging the value with the consequative one
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array in ascending manner is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
        in.close();
    }    
}
