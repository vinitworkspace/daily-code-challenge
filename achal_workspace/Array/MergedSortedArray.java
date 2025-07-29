import java.util.Scanner;

public class MergedSortedArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter size of first array :");
        int n1=sc.nextInt();
        int arr1[]=new int[n1];
        
        
        System.out.println("Enter the value of first array :");
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        System.err.println("Enter size of second array :");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];

        System.out.println("Enter the value of second array :");
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        System.out.println("After sorting ........");
        int i=0,j=0,k=0;
        int arr3[]=new int[n1+n2];

        while(i<n1 &&j<n2){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }
            else{
                arr3[k++]=arr2[j++];
            }
        }
        while(i<n1){
            arr3[k++]=arr1[i++];
        }
        while(j<n2){
            arr3[k++]=arr2[j++];
        }

        for(int a:arr3){
            System.out.print(a+" ");
        }
    }
    
}
