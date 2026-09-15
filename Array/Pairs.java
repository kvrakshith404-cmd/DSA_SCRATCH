package DSA_SCRATCH.Array;
import java.util.*;
public class Pairs { //Time complexity->O(pow(n,2)) space ->O(1)
    public static void Pair_in_Array(int a[]){
        int tp=0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+") ");
                tp++;
            }
            System.out.println();
        }
        // Total pair =(n*(n-1))/2
        System.out.println("Total pairs = "+tp);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,6,8};
        System.out.println("Array: "+Arrays.toString(a));
        System.out.println("Pairs :");
        Pair_in_Array(a);

    }
    
}