 import java.util.*;
 public class Largest_in_Array {  //Time complexity->O(n) space ->O(1)
    public static int Largest(int a[]){
        int Large=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>Large){
                Large=a[i];
            }
        }
        return Large;
    }
    public static void main(String[] args) {
        int a[]={4,5,1,9,2,10,3};
        System.out.println("Array: "+Arrays.toString(a));
        System.out.println("Largest of an array = "+Largest(a));
    }
    
 }