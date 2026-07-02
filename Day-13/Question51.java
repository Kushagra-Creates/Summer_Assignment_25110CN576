import java.util.Scanner;
public class Question51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int[] arr=new int[n]; // declaration and instantiation of array
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){ // input of array elements
            arr[i]=in.nextInt();
        }
        int max=arr[0],min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){ // calculation of Largest element in array
                max=arr[i];
            }
            if(arr[i]<min){ // calculation of Smallest element in array
                min=arr[i];
            }
        }
        System.out.println("Largest element in array: "+max);
        System.out.println("Smallest element in array: "+min);
        in.close();
    }
}
