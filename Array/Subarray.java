package DSA_SCRATCH.Array;
import java.util.*;   
public class Subarray { //Time complexity->O(pow(n,3)) space ->O(1)
    public  static void Sub_Array(int a[]){
        int ts=0;
        int Large=Integer.MIN_VALUE;
        int Small=Integer.MAX_VALUE;
        for(int start=0;start<a.length;start++)
        {
            for(int end=start;end<a.length;end++){
                int sum=0;
                for(int k=start;k<=end;k++){
                    if(k==start){
                        System.out.print("{"+a[k]);
                    }
                    else{
                        System.out.print(a[k]);
                    }
                    if(k==end){
                        System.out.print("} ");
                    }
                    else{
                        System.out.print(",");
                    }
                    sum=sum+a[k];

                }
                ts++;
                if(sum>Large){
                    Large=sum;
                }
                if(sum<Small){
                    Small=sum;
                }
            }
            System.out.println();
        }
        // Total sub array=((n*(n+1))/2)
        System.out.println("Total Sub array : "+ts);
        System.out.println("Maximum Sum of Sub array:"+Large);
        System.out.println("Minimum Sum of Sub array:"+Small);
        
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println("Array: "+Arrays.toString(a));
        System.err.println("Sub Array :");
        Sub_Array(a);
    }

    
}