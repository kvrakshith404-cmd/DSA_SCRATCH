package DSA_SCRATCH.Array;
import java .util.*;
public class ReveseArray {   //Time complexity ->O(n/2)=O(n) and space complexity ->O(1)
    public static void Reverse(int a[]){
        int beg=0;
        int end=a.length-1;
        while(beg<end){
            int temp=a[beg];
            a[beg]=a[end];
            a[end]=temp;
            beg++;
            end--;
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println("Array before Reverse :"+Arrays.toString(a));
        Reverse(a);
        // Pass by reference
        System.out.println("Array After Reverse :"+Arrays.toString(a));

    }

    
}