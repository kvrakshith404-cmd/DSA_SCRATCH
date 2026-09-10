import  java.util.*;
public class Fibonic_series {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=input.nextInt();
        System.out.print("Fibonic Series: ");
        //Base condition
        if(n==0||n==1){
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
