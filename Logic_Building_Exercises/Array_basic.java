 package DSA_SCRATCH.Logic_Building_Exercises;
import java.util.*;
public class Array_basic {
    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("Enter Array elements");
        Scanner input =new  Scanner(System.in);
        // Read data
        for(int i=0;i<a.length;i++){
            a[i]=input.nextInt();
        }
        // Print data
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        input.close();
    }
    }

    
