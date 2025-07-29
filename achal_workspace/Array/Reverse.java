import java.util.*;
public class Reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int len=arr.length-1;
        System.out.println("Enter the value of array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[len];
            arr[len]=temp;
            len--;
        }
        for (int elem : arr) {
            System.err.print(elem+" ");
        }
    }
}
