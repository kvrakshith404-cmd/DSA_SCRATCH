package PatternBase;
import java.util.*;
public class Right_aligned_triangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            // print spaces
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            // star print
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // next line 
            System.out.println(" ");

        }
        input.close();
    }
}
