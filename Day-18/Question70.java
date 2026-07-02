import java.util.Scanner;
public class Question70 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt(); //Insertion of elements in the array
        }
        for(int i=0;i<n-1;i++){ //Loop to control the number of iterations
            int minIndex=0; 
            for(int j=i+1;j<n;j++){ //Loop to control the checking of consequative numbers
                 if (arr[j] < arr[minIndex]) {
                    minIndex = j;
            }
        }
        int temp = arr[i]; //Swapping the numbers 
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        in.close();
    }
}
