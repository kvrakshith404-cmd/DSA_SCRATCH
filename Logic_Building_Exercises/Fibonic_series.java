/*clarify that fibonic series for n is different than fibonic series of nth term */
import  java.util.*;
public class Fibonic_series {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the value for n: ");
        int n=input.nextInt();
        System.out.print("Fibonic Series for n numbers : ");
        //Base condition
        if(n==0){
            System.out.print(n);
            return;
        }
        int prev2=0;
        int prev1=1;
        int f=0;
        int i=0;
        while(i<=n){
            System.out.print(prev2+" ");
            f=prev2+prev1;
            prev2=prev1;
            prev1=f;
            i++;
         }
    }    
}
