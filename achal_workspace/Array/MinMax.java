import java.util.*;

public class MinMax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        int len=arr.length-1;
        System.out.println("Enter the value of array :");
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }

        int min=arr[0];
        int max=arr[0];
        int i=1;
        while(i<len-1){
            if(arr[i]>arr[i+1]){
                if(arr[i]>max) max=arr[i];
                if(arr[i+1]<min)min=arr[i+1];
            }else{
                if(arr[i+1]>max) max=arr[i+1];
                if(arr[i]<min)min=arr[i];
            }
            i+=2;
        }


        System.err.println("Maximum Number : "+max+" Minimum Number : "+min );
    }

}
