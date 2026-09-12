package PatternBase;
import java.util.*;
public class Center_pramid {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value for N:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            // space print
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // star print like 1 3 5 7 ....... 
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
         }
         input.close();
    }
    
}
