import java.util.*;
public class Reversenumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=input.nextInt();
        int rev=0;
        while(n!=0)
        {
            int last=n%10;
             n=n/10;
            rev=(rev*10)+last;
        }
        System.out.println("Reverse of a numebr = "+rev);
 }    
}
