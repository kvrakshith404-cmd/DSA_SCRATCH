package DSA_SCRATCH.Logic_Building_Exercises.PatternBase;
import java.util.*;
public class ButterFly {
    public static void  Butterfly(int n){
        // half part (top)
        for(int i=1;i<=n;i++){
            // star 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half(bottom)
         for(int i=n;i>=1;i--){
            // star 
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int n=input.nextInt();
        Butterfly(n);
        input.close();
    }

    
}