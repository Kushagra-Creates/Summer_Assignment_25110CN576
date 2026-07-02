import java.util.Scanner;
public class Question49 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int[] arr=new int[n]; // declaration and instantiation of array
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){ // input of array elements
            arr[i]=in.nextInt();
        }
        System.out.println("The elements of array are:");
        for(int i=0;i<n;i++){ // output of array elements
            System.out.print(arr[i]+" ");
        }
        in.close();
    }
}
