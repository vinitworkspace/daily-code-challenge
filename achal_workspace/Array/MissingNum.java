import java.util.Scanner;

public class MissingNum {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter size of array :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        int add=0;

        System.out.println("Enter the value of array :");
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
           sum=n*(n+1)/2;
           add+=arr[i];
        }
        int actualNum=sum-add;
        System.out.println("Missing number is : "+actualNum);
    }
    
}
